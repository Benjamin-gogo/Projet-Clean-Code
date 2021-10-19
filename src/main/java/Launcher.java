package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Launcher {
    public static void main(String[] args) throws IOException {
        MyFileManager myFileManager = new MyFileManager();
        StringBuilder builder = myFileManager.readMyFile("texte.txt");
        SegmentEntryDigit sed = new SegmentEntryDigit();
        //System.out.println(sed.getCodeFromLine(builder,0));
        sed.getAllEntries(builder);

        ChecksumCalculator cc = new ChecksumCalculator();
        ProgramResult pr = cc.checksumOperationForAllEntries(sed.getAllEntries(builder));
        myFileManager.writeInFile(pr);
    }
}


