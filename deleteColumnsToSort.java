import java.util.*;
import java.util.List;

public class deleteColumnsToSort 
{
    public List<Integer> deletionSize(String[] stringList)
    {
        List<Integer> index = new ArrayList<Integer>();
        boolean valid = true;
        for(int character=0;character<stringList[0].length();character++)
        {
            if (valid)
            {
                //for loop goes from column one to the rest of the word columns
                for(int column=0;column<stringList.length-1;column++)
                {
                    //this first checks if words are same lenght, if so checks if orders of characters are correct
                    if(stringList[column].length()==stringList[column+1].length())
                    {
                        //if first column character is greater than the character of the next word it adds index in the column
                        if(stringList[column].charAt(character)>stringList[column+1].charAt(character))
                        {
                            index.add(character);
                            break;
                        }
                    }
                    // doesn't start looping through the array if legnth aren't the same
                    else
                    {
                        valid = false;
                    }
                }
            }
            else
            {
                //if lengths nto the same jsut returns -1
                index.add(-1);
                break;
            }
        }
        return index;
    }
    public static void main(String [] args)
    {
        String [] characters = new String[]{"daf","cba","ghi"};
        deleteColumnsToSort columnSort = new deleteColumnsToSort();
        List<Integer> deletion = columnSort.deletionSize(characters);
        System.out.println(deletion.toString());
    }
}