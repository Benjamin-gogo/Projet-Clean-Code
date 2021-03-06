package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitMap {

    static Map<Integer, ArrayList<String>> _digitMap  = new HashMap<Integer, ArrayList<String>>() {{
        put(1, new ArrayList<String> (Arrays.asList(" "," "," "," "," ","|"," "," ","|")));
        put(2, new ArrayList<String> (Arrays.asList(" ","_"," "," ","_","|","|","_"," ")));
        put(3, new ArrayList<String> (Arrays.asList(" ","_"," "," ","_","|"," ","_","|")));
        put(4, new ArrayList<String> (Arrays.asList(" "," "," ","|","_","|"," "," ","|")));
        put(5, new ArrayList<String> (Arrays.asList(" ","_"," ","|","_"," "," ","_","|")));

        put(6, new ArrayList<String> (Arrays.asList(" ","_"," ","|","_"," ","|","_","|")));
        put(7, new ArrayList<String> (Arrays.asList(" ","_"," "," "," ","|"," "," ","|")));
        put(8, new ArrayList<String> (Arrays.asList(" ","_"," ","|","_","|","|","_","|")));
        put(9, new ArrayList<String> (Arrays.asList(" ","_"," ","|","_","|"," ","_","|")));
        put(0, new ArrayList<String> (Arrays.asList(" ","_"," ","|"," ","|","|","_","|")));
    }};

   static public int digitToInteger(ArrayList<String> digitEntry){
        for (Map.Entry elementOfMap : _digitMap.entrySet()) {

            if(elementOfMap.getValue().equals(digitEntry)){
                return elementOfMap.getKey().hashCode();
            }
        }
        return -1;
    }

}
