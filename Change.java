import java.util.*;
class Change
{
    Scanner sc=new Scanner(System.in);
    String str;
    String newstr;
    int len;
    Change()
    {
        str="";
        newstr="";
        len=0;
    }
    void inputword()
    {
        System.out.println("Enter a Word= ");
        str=sc.nextLine();
        len=str.length();
    }
    char caseconvert(char ch)
    {
        int asc=(int)ch;
        if(asc>=65 && asc<=90)
        return (char)(ch+32);
        else if(asc>=97 && asc<=122)
        return (char)(ch-32);
        else
        return ch;
    }
    void recchange(int n)
    {
        if(n==len)
        return;
        else
        {
            newstr=newstr+caseconvert(str.charAt(n));
            recchange(n+1);
        }
    }
    void display()
    {
        System.out.println("String :"+str);
        System.out.println("Changed String :"+newstr);
    }
    void main()
    {
        Change ob=new Change();
        ob.inputword();
        ob.recchange(0);
        ob.display();
    }
}