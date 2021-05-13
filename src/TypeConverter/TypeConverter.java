package TypeConverter;

public class TypeConverter {
    public String splitLines[];
    // public int []getSplitLines;
    public int []convertSplitLines[];

    TypeConverter(String splitLines[], int []convertSplitLines[]){
        this.splitLines = splitLines;
        this.convertSplitLines = convertSplitLines;
    }

    public int[] convertToInt(String splitLines[]){
        int []convertSplitLines = new int[splitLines.length];

        for(int i = 0; i < splitLines.length; i++){
            convertSplitLines[i] = Integer.parseInt(splitLines[i]);
        }

        return convertSplitLines;
    }
}
