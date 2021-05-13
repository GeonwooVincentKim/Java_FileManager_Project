package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public abstract class FileManager {
    public File file;
    public FileWriter fileWriter;
    public Scanner fileReader;

    public FileManager(File file, FileWriter fileWriter, Scanner fileReader){
        this.file = file;
        this.fileWriter = fileWriter;
        this.fileReader = fileReader;
    }

    public abstract Scanner readFile();
}
