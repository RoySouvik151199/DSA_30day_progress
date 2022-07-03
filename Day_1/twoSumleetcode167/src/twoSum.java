import java.util.Arrays;

public class twoSum
{
    public static void main(String[] args)
    {
        int[] numbers = {2,7,11,15};
        int target= 9;
        System.out.println(Arrays.toString(twoSums(numbers, target)));
    }
    public static int[] twoSums(int[] numbers, int target)
    {
        int[] arr={-1,-1};

        for(int index1=0;index1<numbers.length;index1++)
        {
            int otherelement=target-numbers[index1];
            int index2=BinarySearchlastelement(numbers, otherelement);
            if(target==0 && numbers[index1]==0 && otherelement==0)
            {
                arr[0]=index1+1;
                arr[1]=index2+1;
                return arr;
            }
            if(index2!=-1 && numbers[index1]!=numbers[index2])
            {
                arr[0]=index1+1;
                arr[1]=index2+1;
                return arr;
            }
            else if(index2!=-1 && index1!=index2)
            {
                arr[0]=index1+1;
                arr[1]=index2+1;
                return arr;
            }
        }
        return arr;
    }
    public static int BinarySearchlastelement(int[] arr, int target)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
