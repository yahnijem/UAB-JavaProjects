package Lab06;

/**
 * This class represents a Person.
 * It stores the student's name and age.
 * It also makes a method that will display a prompt when a new person is called. 
 */

public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public void displayPerson() {
        System.out.println("Name: " + name + " Age: " + age);
    }

}