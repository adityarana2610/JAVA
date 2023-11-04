import java.util.*;
class selection1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of N= ");
        int N=sc.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter Elements in Array= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ELements in Array are= ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        int min;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Elements after Sorting are= ");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}