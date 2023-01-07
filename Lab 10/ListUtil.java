import java.util.Collections;
import java.util.LinkedList; 
/** 
   This class supplies a utility method to reverse the entries in a linked list. 
*/ 

public class ListUtil 
{ 
    /** 
        Reverses the elements in a linked list 
        @param strings the linked list to reverse 
    */ 
    public static void reverse(LinkedList<String> strings) 
    { 
        // Complete this static method based on its JavaDoc comment. 
        String temp;
        for (int i = 0; i < strings.size()/2; i++) // switches 1st and last, 2nd and 2nd last and so on...
        {
            temp = strings.get(i); //get first string on list
            strings.set(i, strings.get(strings.size() - i - 1)); //set first string as the last
            strings.set(strings.size() - i - 1, temp);    //set last string as the original first
        }
        //Collections.reverse(strings);     //shorter method
    } 
}
