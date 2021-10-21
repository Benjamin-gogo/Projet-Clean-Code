package test;

import main.java.ChecksumCalculator;
import main.java.ProgramResult;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChecksumCalculatorTest {
    ChecksumCalculator checksumCalculator = new ChecksumCalculator();
    ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    @Test
    void checksumOperationForEntry() {
        assertEquals(0, checksumCalculator.checksumOperationForEntry(intList));
    }

    @Test
    void checksumOperationForAllEntries() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> checksumList = new ArrayList<Integer>();
        checksumList.add(0);
        ArrayList<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();
        ProgramResult programResult = new ProgramResult(newList,checksumList);
        testList.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        assertEquals(programResult,checksumCalculator.checksumOperationForAllEntries(testList));
    }
}