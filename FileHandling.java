import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            String filePath = "./Data/School.txt";
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }

            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            FileWriter writer = new FileWriter(filePath);
            writer.write(userInput);
            sc.close();
            writer.close();

            Scanner fileRead = new Scanner(file);
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                System.out.println(line);
            }
            fileRead.close();

            
        } catch (IOException e) {
            System.out.println("An unexpected error is occurred.");
            e.printStackTrace();
        }

    }
}
