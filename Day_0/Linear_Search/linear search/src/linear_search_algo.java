import java.util.*;
public class linear_search_algo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target");
        int target= sc.nextInt();
        System.out.println(searchlinear(a,target));
    }
    public static int searchlinear(int[] arr,int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
