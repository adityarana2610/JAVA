import java.util.*;
class FirstLetter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence= ");
        String s=sc.nextLine();
        s=" "+s;
        char ch;
        char ch1;
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==' ' && (ch1)=='A')
            {
                count=count+1;
            }
        }
        System.out.println("Total Words starting with A are= "+count);
    }
}