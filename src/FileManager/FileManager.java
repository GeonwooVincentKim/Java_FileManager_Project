package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
    Child-Class cannot edit the Parent-Class method parameters, name, and styles
    because this project is based in `Abstract-Function` Style.
*/

public abstract class FileManager {
    public File file;
    public FileWriter fileWriter;
    public Scanner fileReader;

    public FileManager(File file, FileWriter fileWriter, Scanner fileReader){
        this.file = file;
        this.fileWriter = fileWriter;
        this.fileReader = fileReader;
    }

    public abstract Scanner readFile(String fileName);
    public abstract void writeFile(String fileName, String result);
}
