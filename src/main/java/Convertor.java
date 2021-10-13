import java.util.ArrayList;

public class Convertor {

    public static String ArrayEntryToString(ArrayList<Integer> parArr){
        String s = "";
        for (int i: parArr){
            if(i==-1){
                s = s + "?";
            }
            else {
                s = s + i;
            }
        }
        return s;
    }

    public static String ModuloIntegerToString(int valModulo){
        if(valModulo==0){
            return " ";
        }
        if(valModulo==-1){
            return "ILL";
        }

        return "ERR";
    }
}
