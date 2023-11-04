import java.util.*;
class ConsChange
{
    Scanner sc=new Scanner(System.in);
    String word;
    int len;
    ConsChange()
    {
        word="";
        len=0;
    }
    void readword()
    {
        System.out.println("Enter a String= ");
        word=sc.next();
        len=word.length();
    }
    void shiftcons()
    {
        char ch=' ';
        String con="";
        String sort="";
        String vowel="";
        for(int i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowel=vowel+ch;
            }
            else
            {
                con=con+ch;
            }
        }
        sort=con+vowel;
        System.out.println("Shifted Word= "+sort);
        word=sort;
    }
    void changeword()
    {
        char ch=' ';
        String change="";
        for(int i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                change=change+Character.toUpperCase(ch);
            }
            else
            {
                change=change+ch;
            }
        }
        System.out.println("Changed Word= "+change);
    }
    void show()
    {
        System.out.println("Original Word= "+word);
        shiftcons();
        changeword();
    }
    public static void main(String args[])
    {
        ConsChange ob=new ConsChange();
        ob.readword();
        ob.show();
        
    }
}