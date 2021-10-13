import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MyFileManager {

    public StringBuilder readMyFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        // System.out.println(sb);
        return sb;
    }

    public void writeInFile(ProgramResult programResult) {
        try {
            String myEntry, myChecksum;
            FileWriter myWriter = new FileWriter("userStory.txt");

            for (int i = 0; i < programResult.getArraySize(); i++) {
                myEntry = Convertor.ArrayEntryToString(programResult.getArrayOfAllEntries().get(i));
                myChecksum = Convertor.ModuloIntegerToString(programResult.getChecksumValues().get(i));
                myWriter.write(myEntry + " " + myChecksum);
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
