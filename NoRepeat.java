import java.util.*;
class NoRepeat
{
    Scanner sc=new Scanner(System.in);
    String word;
    int len;
    NoRepeat(String wd)
    {
        word=wd;
        len=word.length();
    }

    boolean check()
    {
        for(int i=0;i<len;i++)
        {
            int c=0;
            for(int j=0;j<len;j++)
            {
                if(word.charAt(i)==word.charAt(j))
                {
                    c++;
                }
            }
            if(c>1)
            {
                return false;
            }   
        }
        return true;
    }
    void prn()
    {
        boolean flag=check();
        if(flag)
        {
            System.out.println("No repeated letters");
        }
        else
        {
            System.out.println("Repeated Letters");
        }
    }
    void main()
    {
        System.out.println("Enter a Word: ");
        String s=sc.next();
        NoRepeat ob=new NoRepeat(s);
        ob.prn();
    }
}