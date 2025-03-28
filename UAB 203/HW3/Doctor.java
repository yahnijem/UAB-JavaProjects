package HW3;

public class Doctor extends MedicalStaff{

    public Doctor(String specialty, String department, String role, String firstName, String lastName, String blazerId){
        super(specialty, department, role, firstName, lastName, blazerId);
    }    
    public String toString() {
        return super.toString();
    }
}
