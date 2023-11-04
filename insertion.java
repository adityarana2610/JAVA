import java.util.*;
class insertion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the Elements= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Elements are= ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        
        System.out.println("\n Sorted Elements are= ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}