import java.util.*;
class Encrypt1
{
    Scanner sc=new Scanner(System.in);
    String wrd;
    int len;
    String newwrd;
    Encrypt1()
    {
        wrd="";
        newwrd="";
        len=0;
    }
    void acceptword()
    {
        System.out.println("Enter the Word: ");
        wrd=sc.next();
        len=wrd.length();
    }
    void freqvowcon()
    {
        int vowel=0;
        int con=0;
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                 vowel++;
            }
        }
        con=len-vowel;
        System.out.println("Vowels: "+vowel+"  Consonant: "+con);
    }
    void nextVowel()
    {
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            switch(ch)
            {
                case 'A':
                ch='E';
                break;
                case 'E':
                ch='I';
                break;
                case 'I':
                ch='O';
                break;
                case 'O':
                ch='U';
                break;
                case 'U':
                ch='A';
                break;
            }
            newwrd=newwrd+ch;
        }
    }
    void disp()
    {
        System.out.println("Original Word: "+wrd);
        System.out.println("Encrypted Word: "+newwrd);
    }
    void main()
    {
        Encrypt1 ob=new Encrypt1();
        ob.acceptword();
        ob.freqvowcon();
        ob.nextVowel();
        ob.disp();
    }
}
