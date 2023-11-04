import java.util.*;
class binary1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the Elements");
        int L=0;
        int U=9;
        int M=0;
        int flag=0;
        
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be Searched");
        int n=sc.nextInt();
        while(L<=U)
        {
            M=(L+U)/2;
            if(arr[M]==n)
            {
                flag=1;
                break;
                
            }
            if(arr[M]<n)
            {
                L=M+1;
            }
            if(arr[M]>n)
            {
                U=M-1;
            }
        }
        if(flag==1)
        System.out.println("Search Successful");
        else
        System.out.println("Search Unsuccessful");
    }
}