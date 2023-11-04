import java.util.*;
class linear1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the Elements");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be Searched");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                System.out.println("Search Successful");
                flag=1;
                break;
            }
        }
            
                if(flag==0)
                System.out.println("Search Unsuccessful");
        
    }
}
