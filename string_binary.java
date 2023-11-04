import java.util.*;
class string_binary
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println("Enter the Elements");
        int L=0;
        int U=4;
        int M=0;
        int flag=0;
        
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Enter Word to be Searched");
        String n=sc.next();
        while(L<=U)
        {
            M=(L+U)/2;
            if(arr[M].compareTo(n)==0)
            {
                flag=1;
                break;
                
            }
            if(arr[M].compareTo(n)<0)
            {
                L=M+1;
            }
            if(arr[M].compareTo(n)>0)
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