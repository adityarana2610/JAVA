import java.util.*;
class Longest1
{
    Scanner sc=new Scanner(System.in);
    String str;
    Longest1()
    {
        String str="";
    }
    void read()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.next();
    }
    void count()
    {
        char ch;
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                count=count+1;
            }
        }
        System.out.println("Number of Words= "+count);
    }
    public static void main()
    {
        Longest1 ob=new Longest1();
        ob.read();
        ob.count();
    }
}