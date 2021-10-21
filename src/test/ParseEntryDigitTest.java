package test;

import main.java.MyFileManager;
import main.java.ParseEntryDigit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParseEntryDigitTest {
    static StringBuilder sb = new StringBuilder("    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|");
    ParseEntryDigit parseEntryDigit = new ParseEntryDigit();


    @Test
    void getEntryDigit() {
        assertEquals(parseEntryDigit.getEntryDigit(sb, 0, 0), Arrays.asList(" ", " ", " ", " ", " ", "|", " ", " ", "|"));
    }

    @Test
    void getCodeFromLine() {
        assertEquals(parseEntryDigit.getCodeFromLine(sb, 0), Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    @Test
    void getAllEntries() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<ArrayList<Integer>>();
        testList.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        assertEquals(parseEntryDigit.getAllEntries(sb), testList);
    }
}