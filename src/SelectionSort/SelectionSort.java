package SelectionSort;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import FileManager.AssistantFileManager;


public class SelectionSort {

    public static Scanner readFile(AssistantFileManager asAFM, String fileName){
        return asAFM.readFile(fileName);
    }

    public static String getData(Scanner fileReader){
        int readLine = Integer.parseInt(fileReader.nextLine());
        System.out.println(readLine);

        String result = "";
        int i = 0, j = 0;

        return result;
    }


    public static void writeFile(AssistantFileManager asAFM, String result){
        asAFM.writeFile("result1.txt", result);
    }


    public static void main(String[] args) throws Exception {
        File file = new File("data1.txt");

        Scanner fileReader = null;
        FileWriter fileWriter = null;
        AssistantFileManager mAFM = new AssistantFileManager(file, fileWriter, fileReader);

        fileReader = readFile(mAFM, "data1.txt");
        String getData = getData(readFile(mAFM, "data1.txt"));
        writeFile(mAFM, getData);
    }
}
