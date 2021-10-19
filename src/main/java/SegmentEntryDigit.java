package main.java;

import java.util.ArrayList;

public class SegmentEntryDigit {
    final int SIZE_OF_ONE_DIGIT = 3;
    final int LINE_LENGTH = 28;
    final int NB_OF_DIGIT_PER_LINE = 9;
    final float NB_OF_CHAR_PER_ENTRY = 85;

    public ArrayList<String> getEntryDigit(StringBuilder builder, int index, int startNewLine) {
        ArrayList<String> arrEntryDigit = new ArrayList<String>();

        for (int i = 0; i < 3; i++) { //ligne suivante
            for (int j = 0; j < 3; j++) { //charAt suivant
                arrEntryDigit.add(String.valueOf(builder.charAt(index * SIZE_OF_ONE_DIGIT + startNewLine + j)));
                //System.out.println(index * SIZE_OF_ONE_DIGIT + startNewLine + j);
            }
            startNewLine = startNewLine + LINE_LENGTH;
        }
        return arrEntryDigit;
    }


    public ArrayList<Integer> getCodeFromLine(StringBuilder sb, int indexOfEntry) {
        ArrayList<Integer> arrInt = new ArrayList<Integer>();

        for (int i = 0; i < NB_OF_DIGIT_PER_LINE; i++) {
            arrInt.add(DigitMap.digitToInteger(this.getEntryDigit(sb, i, (int) (indexOfEntry*NB_OF_CHAR_PER_ENTRY) )));
        }

        return arrInt;
    }

    public ArrayList<ArrayList<Integer>> getAllEntries(StringBuilder sb) {
        ArrayList<ArrayList<Integer>> arrInt = new ArrayList<ArrayList<Integer>>();
        int nbEntries = Math.round(sb.length() / NB_OF_CHAR_PER_ENTRY);

        for (int i = 0; i < nbEntries; i++) {
            arrInt.add(this.getCodeFromLine(sb, i));
        }

        //System.out.println(arrInt);
        return arrInt;
    }

}
