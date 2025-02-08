
import java.io.*;
import java.util.Scanner;

public class Pr31 {

    public static void main(String[] args) {
        String fileName = "File1.txt";
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text (type 'exit' to finish):");
            String input;
            Scanner sc=new Scanner(System.in);
            while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input);
                fileWriter.newLine();
            }
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("23DCS076 Jay Patel");
    }
}