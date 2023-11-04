import java.util.*;
class Exchange
{
    Scanner sc=new Scanner(System.in);
    String sent;
    String rev;int size;
    Exchange()
    {
        sent="";
        rev="";
        size=0;
    }
    void readsentence()
    {
        System.out.println("Enter a Sentence: ");
        sent=sc.nextLine();
        size=sent.length();
    }
    void exfirstlast()
    {
        char ch=' ';
        for(int i=size-1;i>=0;i--)
        {
            ch=sent.charAt(i);
            if(ch==' ')
            {
                rev=rev+sent.charAt(size-1);
                rev=rev+sent.substring(size-1);
                rev=rev+sent.charAt(0);
                rev=rev+ch;
                break;
            }
            else
            {
                rev=rev+sent+ch;
            }
        }
    }
    void display()
    {
        System.out.println("Original String: "+sent);
        System.out.println("New String: "+rev);
    }
    void main()
    {
        Exchange ob=new Exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}