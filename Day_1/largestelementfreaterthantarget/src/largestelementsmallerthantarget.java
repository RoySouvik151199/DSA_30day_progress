/*Given a characters array letters[] that is sorted in non-decreasing order and a character target,
return the largest character in the array that is smaller than target.

Note that the letters wrap around.

For example, if target == 'a' and letters == ['c', 'h'], the answer is 'h' .
Example 1:

Input: letters = ["c","f","j"], target = "m"
Output: "j"
Example 2:

Input: letters = ["c","f","j"], target = "j"
Output: "f"
Example 3:

Input: letters = ["c","f","j"], target = "d"
Output: "c"
            */

public class largestelementsmallerthantarget
{
    public static void main(String[] args)
    {
        char[] l={'b','b','b','b','b','c','d','e','f','f','f','f','f','g','h','i'};
        System.out.println(largestelsmallerthantarget(l,'k'));
    }

    public static char largestelsmallerthantarget(char[] letter,char target)
    {
        int s=0;
        int e=letter.length-1;

        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(target>letter[mid])
                s=mid+1;
            else
                e=mid-1;
        }
        if(e<0)
            return letter[letter.length-1];
        else
            return letter[e];
    }
}
