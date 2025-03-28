package HW3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UABPersonTester {
    private static ArrayList<UABPerson> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        loadEmployeesFromFile("uabEmployee.txt"); // this will load employees from the txt file

        
        boolean running = true; //making sure that as long as the user is using the menu it will continue to be scanned and edited
        while (running) {
            displayMenu();
            int options = getUserChoice();
            
            //these will be the different options to choose from
            switch (options) {
                case 1:
                    displayUABPersonList();
                    break;
                case 2:
                    addUABPerson();
                    break;
                case 3:
                    updateDatabase();
                    System.out.println("Database updated successfully!");
                    break;
                case 4:
                    deleteUABPerson();
                    break;
                case 5:
                    running = false; // will completly close down the menu
                    System.out.println("Menu Closed. Bye bye!");
                    break;
                default:
                    System.out.println(" ): Sorry that option is not avalable, please try again.");
            }
        }
        
        scanner.close();
    }
    
    //this is the setup for the menu to help guide the user
    private static void displayMenu() {
        System.out.println("~~~~ UAB Employee System Menu ~~~~");
        System.out.println("1. Display the UABPerson list");
        System.out.println("2. Add UABPerson");
        System.out.println("3. Update the database");
        System.out.println("4. Delete UABPerson");
        System.out.println("5. Exit");
        System.out.print("Pick a menu option (1-5): ");
    }
    
    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; //This will let the system know that the choice is invalid and prompt it again
        }
    }
    
    private static void loadEmployeesFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            //assigning a letter to each role
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                String role = parts[0];
                
                switch (role) {
                    case "F": // Faculty
                        createFaculty(parts);
                        break;
                    case "S": // Student
                        createStudent(parts);
                        break;
                    case "O": // Office Associates
                        createOfficeAssociate(parts);
                        break;
                    case "A": // Advisor
                        createAdvisor(parts);
                        break;
                    case "I": // IT Professional
                        createITProfessional(parts);
                        break;
                    case "M": // Med Staff
                        createMedicalStaff(parts);
                        break;
                }
            }
            
            reader.close();
            System.out.println("Employee data loaded successfully!");
            
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
    
    //components for faculty
    private static void createFaculty(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String department = parts[4];
        int courses = Integer.parseInt(parts[5]);
        
        employees.add(new Faculty(department, courses, "F", firstName, lastName, blazerId));
    }
    
     //components for student
    private static void createStudent(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String level = parts[4];
        String major = parts[5];
        double gpa = Double.parseDouble(parts[6]);
        
        employees.add(new Student(level, major, gpa, "S", firstName, lastName, blazerId));
    }
    
    //components
    private static void createOfficeAssociate(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String position = parts[4];
        String department = parts[5];
        
        employees.add(new OfficeAssociates(position, department, "O", firstName, lastName, blazerId));
    }
    
    //components
    private static void createAdvisor(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String department = parts[4];
        String group = parts[5];
        
        employees.add(new Advisor(group, department, "A", firstName, lastName, blazerId));
    }
    
    //components
    private static void createITProfessional(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String team = parts[4];
        
        employees.add(new ITProfessional(team, "I", firstName, lastName, blazerId));
    }
    
    //components
    private static void createMedicalStaff(String[] parts) {
        String firstName = parts[1];
        String lastName = parts[2];
        String blazerId = parts[3];
        String specialty = parts[4];
        String department = parts[5];
        
        // checking to see if the Med Staff is a doctor or nurse
        if (specialty.equals("Nurse")) {
            String onCall = parts[6];
            employees.add(new Nurse(onCall, specialty, department, "M", firstName, lastName, blazerId));
        } else {
            // every other specialty is a doctor
            employees.add(new Doctor(specialty, department, "M", firstName, lastName, blazerId));
        }
    }
    
    //here is where I start to orginize the list by role
    private static void displayUABPersonList() {
        int facultyCount = 0;
        int studentCount = 0;
        int officeCount = 0;
        int advisorCount = 0;
        int itCount = 0;
        int doctorCount = 0;
        int nurseCount = 0;
        
        // Count each type
        for (UABPerson person : employees) {
            if (person instanceof Faculty) facultyCount++;
            else if (person instanceof Student) studentCount++;
            else if (person instanceof OfficeAssociates) officeCount++;
            else if (person instanceof Advisor) advisorCount++;
            else if (person instanceof ITProfessional) itCount++;
            else if (person instanceof Doctor) doctorCount++;
            else if (person instanceof Nurse) nurseCount++;
        }
        
        System.out.println("\nThe UAB Employee System has the following employees:");
        System.out.println("Total Number of employees = " + employees.size());
        
        // Faculty
        if (facultyCount > 0) {
            System.out.println("Faculty: " + facultyCount);
            for (UABPerson person : employees) {
                if (person instanceof Faculty) {
                    Faculty f = (Faculty) person;
                    System.out.println(f.toString());
                }
            }
        }
        
        // Students
        if (studentCount > 0) {
            System.out.println("Students: " + studentCount);
            for (UABPerson person : employees) {
                if (person instanceof Student) {
                    Student s = (Student) person;
                    System.out.println(s.toString());
                }
            }
        }
        
        // Office Associates
        if (officeCount > 0) {
            System.out.println("Office Associates: " + officeCount);
            for (UABPerson person : employees) {
                if (person instanceof OfficeAssociates) {
                    OfficeAssociates o = (OfficeAssociates) person;
                    System.out.println(o.toString());
                }
            }
        }
        
        // Advisors
        if (advisorCount > 0) {
            System.out.println("Advisors: " + advisorCount);
            for (UABPerson person : employees) {
                if (person instanceof Advisor) {
                    Advisor a = (Advisor) person;
                    System.out.println(a.toString());
                }
            }
        }
        
        // IT Professionals
        if (itCount > 0) {
            System.out.println("IT Professionals: " + itCount);
            for (UABPerson person : employees) {
                if (person instanceof ITProfessional) {
                    ITProfessional i = (ITProfessional) person;
                    System.out.println(i.toString());
                }
            }
        }
        
        // Medical Staff
        int medicalStaffCount = doctorCount + nurseCount;
        if (medicalStaffCount > 0) {
            System.out.println("Total Medical Staff: " + medicalStaffCount);
            
            // Doctors
            if (doctorCount > 0) {
                System.out.println("Doctors: " + doctorCount);
                for (UABPerson person : employees) {
                    if (person instanceof Doctor) {
                        Doctor d = (Doctor) person;
                        System.out.println(d.toString());
                    }
                }
            }
            
            // Nurses
            if (nurseCount > 0) {
                System.out.println("Nurses: " + nurseCount);
                for (UABPerson person : employees) {
                    if (person instanceof Nurse) {
                        Nurse n = (Nurse) person;
                        System.out.println(n.toString());
                    }
                }
            }
        }
    }
    
    //the options for creating a new person
    private static void addUABPerson() {
        System.out.println("\nAdd a new UAB Person");
        System.out.println("Select role:");
        System.out.println("1. Faculty");
        System.out.println("2. Student");
        System.out.println("3. Office Associate");
        System.out.println("4. Advisor");
        System.out.println("5. IT Professional");
        System.out.println("6. Doctor");
        System.out.println("7. Nurse");
        System.out.print("Enter choice (1-7): ");
        
        int choice = getUserChoice();
        
        // Common info for all roles
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter blazerId: ");
        String blazerId = scanner.nextLine();
        
        switch (choice) {
            case 1: // Faculty
                addFaculty(firstName, lastName, blazerId);
                break;
            case 2: // Student
                addStudent(firstName, lastName, blazerId);
                break;
            case 3: // Office Associate
                addOfficeAssociate(firstName, lastName, blazerId);
                break;
            case 4: // Advisor
                addAdvisor(firstName, lastName, blazerId);
                break;
            case 5: // IT Professional
                addITProfessional(firstName, lastName, blazerId);
                break;
            case 6: // Doctor
                addDoctor(firstName, lastName, blazerId);
                break;
            case 7: // Nurse
                addNurse(firstName, lastName, blazerId);
                break;
            default:
                System.out.println("Invalid choice. No person added.");
                return;
        }
        
        System.out.println("Person added successfully!");
    }
    
    private static void addFaculty(String firstName, String lastName, String blazerId) {
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        System.out.print("Enter number of courses: ");
        int courses = Integer.parseInt(scanner.nextLine());
        
        employees.add(new Faculty(department, courses, "F", firstName, lastName, blazerId));
    }
    
    private static void addStudent(String firstName, String lastName, String blazerId) {
        System.out.print("Enter level (Freshman, Sophomore, Junior, Senior): ");
        String level = scanner.nextLine();
        
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());
        
        employees.add(new Student(level, major, gpa, "S", firstName, lastName, blazerId));
    }
    
    private static void addOfficeAssociate(String firstName, String lastName, String blazerId) {
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        employees.add(new OfficeAssociates(position, department, "O", firstName, lastName, blazerId));
    }
    
    private static void addAdvisor(String firstName, String lastName, String blazerId) {
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        System.out.print("Enter group (Undergraduate, Graduate): ");
        String group = scanner.nextLine();
        
        employees.add(new Advisor(group, department, "A", firstName, lastName, blazerId));
    }
    
    private static void addITProfessional(String firstName, String lastName, String blazerId) {
        System.out.print("Enter team: ");
        String team = scanner.nextLine();
        
        employees.add(new ITProfessional(team, "I", firstName, lastName, blazerId));
    }
    
    private static void addDoctor(String firstName, String lastName, String blazerId) {
        System.out.print("Enter specialty: ");
        String specialty = scanner.nextLine();
        
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        employees.add(new Doctor(specialty, department, "M", firstName, lastName, blazerId));
    }
    
    private static void addNurse(String firstName, String lastName, String blazerId) {
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        System.out.print("On call? (Yes/No): ");
        String onCall = scanner.nextLine();
        
        employees.add(new Nurse(onCall, "Nurse", department, "M", firstName, lastName, blazerId));
    }
    
    //the setup for removing a person from the system 
    private static void deleteUABPerson() {
        System.out.println("\nDelete a UAB Person");
        System.out.print("Enter the blazerId of the person to delete: ");
        String blazerId = scanner.nextLine();
        
        UABPerson personToRemove = null;
        for (UABPerson person : employees) {
            if (person.getBlazerId().equals(blazerId)) {
                personToRemove = person;
                break;
            }
        }
        
        if (personToRemove != null) {
            employees.remove(personToRemove);
            System.out.println("Person with blazerId " + blazerId + " deleted successfully!");
        } else {
            System.out.println("No person found with blazerId " + blazerId);
        }
    }
    
    //updated version of data that is rewriten back to the original fine after add/removing
    private static void updateDatabase() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("uabEmployee.txt"));
            
            for (UABPerson person : employees) {
                String line = "";
                
                if (person instanceof Faculty) {
                    Faculty f = (Faculty) person;
                    line = "F " + f.getFirstName() + " " + f.getLastName() + " " + f.getBlazerId() + " " + 
                           f.getDepartment() + " " + f.getCourses();
                } else if (person instanceof Student) {
                    Student s = (Student) person;
                    line = "S " + s.getFirstName() + " " + s.getLastName() + " " + s.getBlazerId() + " " + 
                           s.getLevel() + " " + s.getMajor() + " " + s.getGpa();
                } else if (person instanceof OfficeAssociates) {
                    OfficeAssociates o = (OfficeAssociates) person;
                    line = "O " + o.getFirstName() + " " + o.getLastName() + " " + o.getBlazerId() + " " + 
                           o.getPosition() + " " + o.getDepartment();
                } else if (person instanceof Advisor) {
                    Advisor a = (Advisor) person;
                    line = "A " + a.getFirstName() + " " + a.getLastName() + " " + a.getBlazerId() + " " + 
                           a.getDepartment() + " " + a.getGroup();
                } else if (person instanceof ITProfessional) {
                    ITProfessional i = (ITProfessional) person;
                    line = "I " + i.getFirstName() + " " + i.getLastName() + " " + i.getBlazerId() + " " + 
                           i.getTeam();
                } else if (person instanceof Nurse) {
                    Nurse n = (Nurse) person;
                    line = "M " + n.getFirstName() + " " + n.getLastName() + " " + n.getBlazerId() + " " + 
                           n.getSpecialty() + " " + n.getDepartment() + " " + n.getOnCall();
                } else if (person instanceof Doctor) {
                    Doctor d = (Doctor) person;
                    line = "M " + d.getFirstName() + " " + d.getLastName() + " " + d.getBlazerId() + " " + 
                           d.getSpecialty() + " " + d.getDepartment();
                }
                
                writer.write(line);
                writer.newLine();
            }
            
            writer.close();
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}