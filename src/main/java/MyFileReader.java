import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyFileReader {

    public StringBuilder readMyFile(String fileName){
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.length());
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);
        return sb;
    }
}
