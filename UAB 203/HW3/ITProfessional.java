package HW3;

public class ITProfessional extends UABPerson{
    private String team;

    public ITProfessional(String team, String role, String firstName, String lastName, String blazerId){
        super(role, firstName, lastName, blazerId);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    
    public String toString() {
        return super.toString() + " " + team;
    }
}
