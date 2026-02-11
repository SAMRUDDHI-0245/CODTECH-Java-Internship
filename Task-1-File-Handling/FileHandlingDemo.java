import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        // File name
        String fileName = "sample.txt";

        try {
            // ===============================
            // 1. WRITE DATA TO FILE
            // ===============================
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello, this is my first file handling program.");
            bufferedWriter.newLine();
            bufferedWriter.write("Internship Task 1 completed.");

            bufferedWriter.close();
            System.out.println("File written successfully.\n");

            // ===============================
            // 2. READ DATA FROM FILE
            // ===============================
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Reading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

            // ===============================
            // 3. MODIFY FILE (APPEND DATA)
            // ===============================
            FileWriter appendWriter = new FileWriter(fileName, true);
            BufferedWriter appendBufferedWriter = new BufferedWriter(appendWriter);

            appendBufferedWriter.newLine();
            appendBufferedWriter.write("This line is added to modify the file.");

            appendBufferedWriter.close();
            System.out.println("\nFile modified successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
    }
}
