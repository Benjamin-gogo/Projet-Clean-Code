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
        //System.out.println(sed.getCodeFromLine(builder,0));
        //sed.getAllEntries(builder);

    }
}


