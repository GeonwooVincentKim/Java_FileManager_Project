package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


/*
    Child-Class
    1. Overloading -> Overload same function name in same class.
    2. Overriding -> Overload same function name in different class.
                  -> It's good for when you trying to make the file-logic 
                     that some-class 'B' derives from some-class 'A'.
*/

public class AssistantFileManager extends FileManager {
    public AssistantFileManager(File file, FileWriter fileWriter, Scanner fileReader){
        super(file, fileWriter, fileReader);
    }

    @Override
    public Scanner readFile(String fileName) {
        // TODO Auto-generated method stub
        file = new File(fileName);
        
        try {
            fileReader = new Scanner(file);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return fileReader;
    }

    public String getData(Scanner fileReader){
        String result = "";
        return result;
    }

    @Override
    public void writeFile(String fileName, String result) {
        // TODO Auto-generated method stub
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
