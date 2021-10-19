package main.java;

import java.util.ArrayList;

public class Convertor {

    public static String ArrayEntryToString(ArrayList<Integer> entry){
        String s = "";
        for (int i: entry){
            if(i==-1){
                s = s + "?";
            }
            else {
                s = s + i;
            }
        }
        return s;
    }

    public static String ChecksumValueToString(int checksumValue){
        if(checksumValue==0){
            return " ";
        }
        if(checksumValue==-1){
            return "ILL";
        }

        return "ERR";
    }
}
