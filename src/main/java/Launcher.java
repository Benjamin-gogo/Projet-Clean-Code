package main.java;

import java.io.*;


public class Launcher {
    public static void main(String[] args) throws IOException {
        MyFileManager myFileManager = new MyFileManager();
        StringBuilder builder = myFileManager.readMyFile("texte.txt");
        ParseEntryDigit parser = new ParseEntryDigit();
        //System.out.println(sed.getCodeFromLine(builder,0));
        parser.getAllEntries(builder);

        ChecksumCalculator cc = new ChecksumCalculator();
        ProgramResult pr = cc.checksumOperationForAllEntries(parser.getAllEntries(builder));
        myFileManager.writeInFile(pr);
    }
}


