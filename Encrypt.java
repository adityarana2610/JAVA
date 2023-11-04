import java.util.*;
class Encrypt
{
    Scanner sc=new Scanner(System.in);
    String wrd;
    int len;
    String newwrd;
    Encrypt()
    {
        wrd="";
        newwrd="";
        len=0;
    }
    void acceptword()
    {
        System.out.println("Enter a Word: ");
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
        System.out.println("New Word: "+newwrd);
    }
    void main()
    {
        Encrypt ob=new Encrypt();
        ob.acceptword();
        ob.freqvowcon();
        ob.nextVowel();
        ob.disp();
    }
}
