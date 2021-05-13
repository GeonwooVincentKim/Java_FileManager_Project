package SelectionSort;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import FileManager.AssistantFileManager;
import TypeConverter.TypeConverter;


public class SelectionSort {
    
    public static Scanner readFile(AssistantFileManager asAFM, String fileName){
        return asAFM.readFile(fileName);
    }

    public static void writeFile(AssistantFileManager asAFM, String result){
        asAFM.writeFile("result1.txt", result);
    }
    
    public static String getData(Scanner fileReader){
        
        int readLine = Integer.parseInt(fileReader.nextLine());
        System.out.println(readLine);
        
        String getLine = "";
        String splitLines[] = null;
        int []convertSplitLines = null;

        String result = "";
        int i = 0, j = 0;
        
        for(i = 1; i <= readLine; i++){
            if(!fileReader.hasNextLine()){
                System.out.println("더 이상 입력할 수 있는 줄이 존재하지 않습니다.");
            }
            
            TypeConverter mCon = new TypeConverter();

            getLine = fileReader.nextLine();
            splitLines = getLine.split(" ");
            convertSplitLines = mCon.convertToInt(splitLines);

            for(j = 0; j < convertSplitLines.length; j++){
                System.out.print(convertSplitLines[j] + " ");
            }
            System.out.println();
        }


        return result;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("data1.txt");

        Scanner fileReader = null;
        FileWriter fileWriter = null;
        
        /* 
            If there is no Abstract in AssistantFileManager, you can convert AssistantFileManager into the FileManager.
            AssistantFileManager mAFM = new FileManager(file, fileWriter, fileReader);
            
            Or, you can just convert FileManager into the AssistantFileManager using `Type-Cast-Operator`
            FileManager mFM = new FileManager(file, fileWriter, fileReader);
            AssistantFileManager mAFM = (AssistantFileManager) mFM;
        */
        AssistantFileManager mAFM = new AssistantFileManager(file, fileWriter, fileReader);


        fileReader = readFile(mAFM, "data1.txt");
        String getData = getData(readFile(mAFM, "data1.txt"));
        writeFile(mAFM, getData);
    }
}
