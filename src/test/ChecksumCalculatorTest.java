package test;

import main.ChecksumCalculator;
import main.ProgramResult;
import org.junit.jupiter.api.Test;

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
        testList.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        ProgramResult programResult = new ProgramResult(testList,checksumList);
        assertEquals(programResult.toString(),checksumCalculator.checksumOperationForAllEntries(testList).toString());
    }
}