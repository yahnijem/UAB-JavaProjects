package Lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 * This class reads a file, creates and displays a new person.
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        try { 
            File f = new File("sample_data.txt");
            Scanner s = new Scanner(f);

            System.out.println("People from file:");
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(",");
                
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    Person person = new Person(name, age);
                    person.displayPerson();
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}