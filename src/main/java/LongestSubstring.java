import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int i;
        List<Character> array= new ArrayList();
        int length=0;
        for(i=0;i<s.length();i++)
        {
            if(array.equals(null))
            {
//                array.add(s.charAt(i));
            }
            else
            {
                if(!array.contains(s.charAt(i)))
                {
                    length++;
                }
            }
        }
        return length;
    }
    public static void main(String args[])
    {
        System.out.println("Result::::::::::::"+lengthOfLongestSubstring("abcdaacc"));
    }
}
