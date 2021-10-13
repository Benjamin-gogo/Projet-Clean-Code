import java.io.*;

public class Launcher {
    public static void main(String[] args) throws IOException {
        MyFileManager myFileManager = new MyFileManager();
        StringBuilder builder = myFileManager.readMyFile("texte.txt");
        SegmentEntryDigit sed = new SegmentEntryDigit();
        ChecksumCalculator cc = new ChecksumCalculator();
        ProgramResult pr = cc.checksumOperationForAllEntries(sed.getAllEntries(builder));
        myFileManager.writeInFile(pr);
    }
}


