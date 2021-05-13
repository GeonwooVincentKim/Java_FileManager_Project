package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class ReadFileManager extends FileManager {
    public ReadFileManager(File file, FileWriter fileWriter, Scanner fileReader){
        super(file, fileWriter, fileReader);
    }

    @Override
    public Scanner readFile() {
        // TODO Auto-generated method stub
        return null;
    }
}
