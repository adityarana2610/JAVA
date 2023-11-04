import java.util.*;
class Revstr
{
    Scanner sc=new Scanner(System.in);
    String Str;
    String Revst;
    Revstr()
    {
        Str="";
        Revst="";
    }
    void getStr()
    {
        System.out.println("Enter a Sentence= ");
        Str=sc.next();
    }
    void recReverse(int a)
    {
        if(a==0)
        {
            return;
        }
        else
        {
            Revst=Revst+Str.charAt(a-1);
            recReverse(a-1);
        }
    }
    void check()
    {
        System.out.println("Original String= " +Str);
        System.out.println("Reversed String= " +Revst);
        if(Str.equals(Revst))
        System.out.println("String"+Str+" is a palindrome");
        else
        System.out.println("String"+Str+" is not a palindrome");
    }
}