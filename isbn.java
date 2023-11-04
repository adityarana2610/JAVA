import java.util.*;
class isbn
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter the Number: ");
        str=sc.next();
        int len=str.length();
        if(len!=10)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        String s="";
        long sum=0;
        if(str.charAt(len-1)=='X')
        {
            s=str.replace('X','1');
            sum=9;
        }
        else
            s=str;
        long val=Long.parseLong(s);
        int i=1;
        while(val!=0)
        {
            long digit=val%10;
            sum=sum+digit*i;
            val=val/10;
            i=i+1;
        }
        if(sum%11==0)
        {
            System.out.println("SUM="+sum);
            System.out.println("LEAVES NO REMAINDER-VALID ISBN CODE");
        }
        else
        {
            System.out.println("SUM="+sum);
            System.out.println("LEAVES  REMAINDER-INVALID ISBN CODE");

        }
    }
}