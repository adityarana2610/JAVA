import java.util.*;
class First_Letter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        char ch;
        int len;
        System.out.println("Enter a Sentence= ");
        s=sc.nextLine();
        s=" "+s;
        s=s.toUpperCase();
        len=s.length();
        System.out.print("OUTPUT: ");
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            System.out.print(s.charAt(i+1)+".");
        }
    }
}