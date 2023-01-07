import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListUtil 
{
    //static method to reverse generic arrayList without modifying the original list
    public static <T> List<T> reverseArrayList(List<T> list)
    {
        ArrayList reversed = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            T t = list.get(i);    
            reversed.add(t);
        }
        return reversed;
    }

    //static method to reverse generic arrayList
    public static <T> void reverseList(List<T> list)
    {
        Collections.reverse(list);
    }    

    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> reverse = reverseArrayList(list);
        System.out.println(reverse); //reversed without modifying original
        System.out.println(list);     //proof of above
        reverseList(list);
        System.out.println(list);  //reversed by modifying original
    }
}