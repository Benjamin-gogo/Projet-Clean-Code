package main;

import java.util.ArrayList;

public class ProgramResult {
    ArrayList<ArrayList<Integer>> arrayOfAllEntries;
    ArrayList<Integer> checksumValues;
    int arraySize;

    public ProgramResult(ArrayList<ArrayList<Integer>> arrayOfAllEntries, ArrayList<Integer> checksumValues) {
        this.arrayOfAllEntries = arrayOfAllEntries;
        this.checksumValues = checksumValues;
        if(arrayOfAllEntries.size() == checksumValues.size()){
            arraySize = arrayOfAllEntries.size();
        }
    }

    public ArrayList<ArrayList<Integer>> getArrayOfAllEntries() {
        return arrayOfAllEntries;
    }

    public ArrayList<Integer> getChecksumValues() {
        return checksumValues;
    }

    public int getArraySize() {
        return arraySize;
    }

    @Override
    public String toString() {
        return "ProgramResult{" +
                "arrayOfAllEntries=" + arrayOfAllEntries +
                ", checksumValues=" + checksumValues +
                ", arraySize=" + arraySize +
                '}';
    }
}
