package main;

import java.util.ArrayList;

public class ChecksumCalculator {
    final static int VAL_MODULO = 11;

    public int checksumOperationForEntry(ArrayList<Integer> entry){
        if(entry.contains(-1)){
            return -1;
        }

        int sizeOfEntry = entry.size();
        int result = 0;

        for (int valueOfEntryDigit : entry){
            result = result + (sizeOfEntry*valueOfEntryDigit);
            sizeOfEntry--;
        }

        return result%VAL_MODULO;
    }

    public ProgramResult checksumOperationForAllEntries(ArrayList<ArrayList<Integer>> allEntries){
        ProgramResult programResult ;
        ArrayList<Integer> arrayOfModulo = new ArrayList<Integer>();

        for(ArrayList<Integer> entry: allEntries){
            arrayOfModulo.add(checksumOperationForEntry(entry));
        }

        programResult = new ProgramResult(allEntries,arrayOfModulo);
        return programResult;
    }

}
