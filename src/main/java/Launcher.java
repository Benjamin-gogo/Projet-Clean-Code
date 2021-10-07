import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Launcher {
    public static void main(String[] args) throws IOException {
        MyFileReader myFileReader = new MyFileReader();
        StringBuilder builder = myFileReader.readMyFile("texte.txt");

        SegmentEntryDigit sed = new SegmentEntryDigit();
        System.out.println(sed.getEntryDigit(builder,0));

        System.out.println(DigitMap.digitToInteger(sed.getEntryDigit(builder,0)));
        //System.out.println(DigitMap._digitMap.get(1));


     //  System.out.println(DigitMap._digitMap.containsValue(new ArrayList<String>(Arrays.asList("","_","","|","_","","|","_","|"))));

        //ArrayList<String> arr = new ArrayList<String>(Arrays.asList("","_","","|","_","","|","_","|"));
        //System.out.println(DigitMap.digitToInteger(arr));



    }
}


