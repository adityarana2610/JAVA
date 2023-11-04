import java.util.*;
class TheString
{
    Scanner sc=new Scanner(System.in);
    String str;
    int len;int wordcount;int cons;
    TheString()
    {
        str="";
        len=0;
        wordcount=0;
        cons=0;
    }
    TheString(String ds)
    {
        str=ds;
    }
    void countFreq()
    {
        //System.out.println("Enter a String= ");
        //str=sc.nextLine();
        len=str.length();
        str=str.toLowerCase();
        char ch=' ';
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                wordcount++;
            }
            else if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                cons++;
            }
        }
    }
    void display()
    {
        System.out.println("Original String= "+str);
        System.out.println("Number of Words= "+(wordcount+1));
        System.out.println("Number of Consonants= "+cons);
    }
    public static void main(String args[])
    {
        TheString ob=new TheString("My name is aditya");
        ob.countFreq();
        ob.display();
    }
}