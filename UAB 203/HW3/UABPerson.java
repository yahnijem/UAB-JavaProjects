package HW3;

public class UABPerson {
    private String role;
    private String firstName;
    private String lastName;
    private String blazerId;


    public UABPerson(String role, String firstName, String lastName, String blazerId){
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.blazerId = blazerId;
    }



    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getBlazerId() {
        return blazerId;
    }
    public void setBlazerId(String blazerId) {
        this.blazerId = blazerId;
    }


    public String toString() {
        return role + " " + firstName + " " + lastName + " " + blazerId + " " + role;
    }


    
}
