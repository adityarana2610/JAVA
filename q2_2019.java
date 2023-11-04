import java.util.*;
class q2_2019
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array= ");
        int n=sc.nextInt();
        if(n<2 ||n>10)
        {
            System.out.println("Matrix size out of range");
            return;
        }
        int arr[]=new int[n];
        int Arr[][]=new int[n][n];
        System.out.println("Enter Elements in Array= ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is= ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}