import java.util.*;
class Uppercase3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence= ");
        String s=sc.nextLine();
        s=" "+s;
        int count=0;
        int len=s.length();
        s=s.toUpperCase();
        for(int i=0;i<len-1;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)=='A')
            count++;
        }
        System.out.println("Total Number of words starting with letter 'A'= "+count);
    }
}
