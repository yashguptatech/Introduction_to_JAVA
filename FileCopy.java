import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Provide the file paths for the source and destination files
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try {
            // Create file input stream for the source file
            FileInputStream sourceStream = new FileInputStream(sourceFilePath);

            // Create file output stream for the destination file
            FileOutputStream destinationStream = new FileOutputStream(destinationFilePath);

            // Create a buffer to read and write data in chunks
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read data from the source file and write to the destination file
            while ((bytesRead = sourceStream.read(buffer)) != -1) {
                destinationStream.write(buffer, 0, bytesRead);
            }

            // Close the streams
            sourceStream.close();
            destinationStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
