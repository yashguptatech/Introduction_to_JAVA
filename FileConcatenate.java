import java.io.*;

public class FileConcatenate {
    public static void main(String[] args) {
        // Provide the file paths for the source files and the destination file
        String sourceFilePath1 = "file1.txt";
        String sourceFilePath2 = "file2.txt";
        String destinationFilePath = "concatenated.txt";

        try {
            // Create file input streams for the source files
            FileInputStream sourceStream1 = new FileInputStream(sourceFilePath1);
            FileInputStream sourceStream2 = new FileInputStream(sourceFilePath2);

            // Create file output stream for the destination file
            FileOutputStream destinationStream = new FileOutputStream(destinationFilePath);

            // Create a buffer to read and write data in chunks
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read data from the first source file and write to the destination file
            while ((bytesRead = sourceStream1.read(buffer)) != -1) {
                destinationStream.write(buffer, 0, bytesRead);
            }

            // Read data from the second source file and write to the destination file
            while ((bytesRead = sourceStream2.read(buffer)) != -1) {
                destinationStream.write(buffer, 0, bytesRead);
            }

            // Close the streams
            sourceStream1.close();
            sourceStream2.close();
            destinationStream.close();

            System.out.println("Files concatenated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
