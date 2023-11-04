import java.util.*;
class string1_binary
{
    public static void main()
    {
        String Arr[]=new String[10];
        Scanner sc=new Scanner(System.in);
        int R=0;
        int C=0;
        System.out.println("Enter Names in the Array= ");
        int flag=0;
        int U=9;
        int L=0;
        int M=0;
        for(int i=0;i<10;i++)
        {
            
        
                Arr[i]=sc.next();
        }
        
        System.out.println("Enter Name to Search= ");
        String n=sc.next();
        while(L<=U)
        {
            M=(L+U)/2;
            if(Arr[M].compareTo(n)==0)
            {
                flag=1;
                break;
                
            }
            if(Arr[M].compareTo(n)<0)
            {
                L=M+1;
            }
            if(Arr[M].compareTo(n)>0)
            {
                U=M-1;
            }
        }
        if(flag==1)
        System.out.println("Word Found");
        else
        System.out.println("Word not Found");
    }
}