package HW3;

public class OfficeAssociates extends UABPerson{
    private String position;
    private String department;
    
    public OfficeAssociates(String position, String department, String role, String firstName, String lastName, String blazerId){
        super(role, firstName, lastName, blazerId);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return super.toString() + " " + position + " " + department;
    }
    
}
