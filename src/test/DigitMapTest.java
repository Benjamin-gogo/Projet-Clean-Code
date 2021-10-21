package test;

import main.java.DigitMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DigitMapTest {

    @org.junit.jupiter.api.Test
    void digitToInteger() {
        ArrayList<String> testDigitString = new ArrayList<String>(Arrays.asList(" "," "," "," "," ","|"," "," ","|"));
        int res = DigitMap.digitToInteger(testDigitString);
        assertEquals(1, res);

    }

    @Test
    void digitToIntegerFailed(){
        ArrayList<String> testDigitString = new ArrayList<String>(Arrays.asList(" "," "," "," "," ","|"," "," "));
        int res = DigitMap.digitToInteger(testDigitString);
        assertEquals(-1, res);
    }
}