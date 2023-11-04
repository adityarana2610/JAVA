import java.util.*;
class Unique
{
    Scanner sc=new Scanner(System.in);
    String word;
    int len;
    Unique()
    {
        word="";
        len=0;
    }
    void acceptword()
    {
        System.out.println("Enter a Word: ");
        word=sc.next();
        word=word.toUpperCase();
        len=word.length();
    }
    boolean checkUnique()
    {
        char ch=word.charAt(0);
        char ch1=word.charAt(len-1);
        if((ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')&& (ch1 =='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void display()
    {
        boolean flag=checkUnique();
        if(flag)
        {
            System.out.println("WORD IS UNIQUE");
        }
        else
        {
            System.out.println("WORD IS NOT UNIQUE");
        }
    }
    void main()
    {
        Unique ob=new Unique();
        ob.acceptword();
        ob.display();
    }
}
