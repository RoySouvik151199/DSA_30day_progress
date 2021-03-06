import java.util.Arrays;

public class twoSum
{
    public static void main(String[] args)
    {
        int[] numbers = {2,7,11,15};
        int target= 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target)
                return new int[]{l+1,r+1};
            else if(numbers[l]+numbers[r]<target)
                l++;
            else
                r--;
        }
        return new int[]{-1,-1};
    }
}
