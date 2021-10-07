import java.util.ArrayList;
import java.util.Arrays;

public class SegmentEntryDigit {
    final int SIZE_OF_ONE_DIGIT = 3;
    final int LINE_LENGTH = 28;
    final int NB_OF_DIGIT_PER_LINE = 9;

    public ArrayList<String> getEntryDigit(StringBuilder builder, int index){
        ArrayList<String> arrEntryDigit = new ArrayList<String>();
        int localInt = 0;

        for (int i = 0; i < 3; i++) { //ligne suivante
            for (int j = 0; j < 3; j++) { //charAt suivant
                arrEntryDigit.add(String.valueOf(builder.charAt(index*SIZE_OF_ONE_DIGIT + localInt + j)));
            }
            localInt = localInt + LINE_LENGTH;
        }
        return arrEntryDigit;
    }


    public ArrayList<Integer> getCodeFromLine(StringBuilder sb){
        ArrayList<Integer> arrInt = new ArrayList<Integer>();

        for (int i = 0; i < NB_OF_DIGIT_PER_LINE; i++) {
            arrInt.add(DigitMap.digitToInteger(this.getEntryDigit(sb,i)) );
        }

        return arrInt;
    }
}
