import java.util.*;
class bubble
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;int j;int temp;
        int arr[]=new int[10];
        System.out.println("Enter 10 integers= ");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println("Elements in Ascending Order are= ");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}