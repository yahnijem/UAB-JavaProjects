package HW3;

public class Nurse extends MedicalStaff{
    private String onCall;
    
    public Nurse(String onCall, String specialty, String department, String role, String firstName, String lastName, String blazerId){
        super(specialty, department, role, firstName, lastName, blazerId);
        this.onCall = onCall;
    }

    public String getOnCall() {
        return onCall;
    }

    public void setOnCall(String onCall) {
        this.onCall = onCall;
    }
    
    public String toString() {
        return super.toString() + " " + onCall;
    }
    
}
