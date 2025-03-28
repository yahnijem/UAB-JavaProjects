package Lab07;
/**
 * This class represents a Student.
 * It stores the student's name, age, and grades to calculate the final grade and letter in the class.
 */

public class Student {
    private String Name;
    private String lastName;
    private int exam1,exam2, finalExam;
    private double finalGrade;
    private String letterGrade;

    public Student(String Name, String lastName, int exam1, int exam2, int finalExam, double finalGrade, String letterGrade){
        // create your constructor
        this.Name = Name;
        this.lastName =lastName;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.finalExam = finalExam;
        this.finalGrade = finalGrade;
        this.letterGrade = letterGrade;
    }

    // create all of the necessary accessor and mutator methods
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExam1() {
        return exam1;
    }

    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    public int getExam2() {
        return exam2;
    }

    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }


    public void setFinalGrade(){
        this.finalGrade = (0.25 * this.exam1) + (0.25 * this.exam2) + (0.50 * this.finalExam); //25% Exam 1, 25% Exam 2, 50% Final Exam
    }
    public void setLetterGrade(){
        if (finalGrade >= 90){
            this.letterGrade = "A";
        }else if (90 > finalGrade && finalGrade >= 80){
            this.letterGrade = "B";
        }else if (80 > finalGrade && finalGrade >= 70){
            this.letterGrade = "C";
        }else {
            this.letterGrade = "F";
        }

    }

}
