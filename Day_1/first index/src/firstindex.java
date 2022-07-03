public class firstindex
{
    public static void main(String[] args)
    {
        int[] l={3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,6,6,6,7,7,9,9,9,10,11,20,20,20,20};

        System.out.println(leftmosttarget(l,3));
    }
    public static int leftmosttarget(int[] arr,int target)
    {
        int ans=-1;
        int start= 0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
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
