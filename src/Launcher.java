import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Launcher {
    public static void main(String[] args) throws IOException {
        String one = " |\n|";
        MyFileReader myFileReader = new MyFileReader();
        StringBuilder builder = myFileReader.readMyFile("texte.txt");
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_' && i < 23) {
                System.out.print("2-3-5-6-7-8-9 ?");
            } else {
                if (builder.charAt(i) == '|' && i < 51 && i > 23 && builder.charAt(i + 1) == ' ' && builder.charAt(i - 1) != '_') {
                    System.out.print("1-7 L2?");
                    if (builder.charAt(i) == '|' && i < 80 && i > 51 && builder.charAt(i + 1) != ' ' && builder.charAt(i - 1) != '_') {
                        System.out.print("1-7 L3?");
                    }
                }
          /*  if (builder.charAt(i) == '|' && i < 51 && i > 23 && builder.charAt(i+1) == ' ' && builder.charAt(i-1) != '_'){
                System.out.print("1-7?");
            }*/

      /*      if (builder.charAt(i) == '|' && i < 80 && i > 51 && builder.charAt(i+1) != ' ' && builder.charAt(i-1) != '_'){
                System.out.print("1-7?");
            }*/
            }
            System.out.println(builder.charAt(i) + " " + i);
        }
    }
}


