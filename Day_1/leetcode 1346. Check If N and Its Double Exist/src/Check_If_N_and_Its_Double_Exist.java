import java.util.Arrays;

public class Check_If_N_and_Its_Double_Exist
{
    public static void main(String[] args)
    {
        int[] numbers = {10,2,5,3};
        System.out.println(checkIfExist(numbers));
    }
    public static boolean checkIfExist(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0 && arr[i+1]==0)
            {
                return true;
            }
            else if(arr[i]==0 && arr[i+1]!=0)
            {
                i++;
            }
            int a=2*arr[i];
            if(binarysearch(arr,a))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean binarysearch(int arr[], int target)
    {
        int start =0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return true;
        }
        return false;
    }
}

