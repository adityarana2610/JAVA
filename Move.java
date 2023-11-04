import java.util.*;
class Move
{
    Scanner sc=new Scanner(System.in);
    String str;
    int pos;
    void read()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.next();
        System.out.println("Enter the Shift Value= ");
        pos=sc.nextInt();
    }
    void shift()
    {
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=65 && ch<=89)
            
                ch=ch+1;
                else
                ch=ch-26;
            
        }
    }
    void main()
    {
        Move ob=new Move();
        ob.read();
        ob.shift();
    }
}