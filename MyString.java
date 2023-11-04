import java.util.*;
class MyString
{
    Scanner sc=new Scanner(System.in);
    String str;
    String s;
    MyString()
    {
        str="";
    }
    void accept()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
        str=" "+str;
        str=str.toUpperCase();
    }
    boolean check(String s)
    {
        if(s.charAt(0)==s.charAt(s.length()-1))
        return true;
        else
        return false;
    }
    void show()
    {
        System.out.println(str);
    }
}