package HW3;

public class MedicalStaff extends UABPerson{
    private String specialty;
    private String department;

    public MedicalStaff(String specialty, String department, String role, String firstName, String lastName, String blazerId){
        super(role, firstName, lastName, blazerId);
        this.specialty = specialty;
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public String toString() {
        return super.toString() + " " + specialty + " " + department;
    }

}
