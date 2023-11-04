import java.util.*;
class Uppercase_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Word= ");
        String str=sc.next();
        str=str.toLowerCase();
        int len=str.length();
        String s="";
        char ch;
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                char ch1=(char)(ch+1);
                s=s+ch1;
            }
            else
            {
                s=s+ch;
            }
        }
        System.out.println(s);
    }
}