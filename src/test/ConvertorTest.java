package test;

import main.Convertor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @Test
    void arrayEntryToString() {
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        assertEquals("123456789", Convertor.ArrayEntryToString(intList));
    }

    @Test
    void checksumValueToString() {
        assertEquals(" ", Convertor.ChecksumValueToString(0));
    }
}