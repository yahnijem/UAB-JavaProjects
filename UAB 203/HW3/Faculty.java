package HW3;

public class Faculty extends UABPerson{
    private String department;
    private int courses;

    public Faculty(String department, int courses, String role, String firstName, String lastName, String blazerId){
        super(role, firstName, lastName, blazerId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourses() {
        return courses;
    }
    public void setCourses(int courses) {
        this.courses = courses;
    }
    
    public String toString() {
        return super.toString() + " " + department + " " + courses;
    }



    
}
