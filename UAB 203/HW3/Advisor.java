package HW3;

public class Advisor extends UABPerson{
    private String group;
    private String department;

    public Advisor(String group, String department,String role, String firstName, String lastName, String blazerId){
        super(role, firstName, lastName, blazerId);
        this.group = group;
        this.department = department;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    public String toString() {
        return super.toString() + " " + group + " " + department;
    }
    
}
