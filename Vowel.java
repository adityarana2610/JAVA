import java.util.*;
class Vowel
{
    Scanner sc=new Scanner(System.in);
    String str="";
    void main()
    {
        System.out.println("Enter a String= ");
        str=sc.nextLine();
        int len=str.length();
        char ch=str.charAt(len-1);
        if(ch!='.' && ch!='?' && ch!='!')
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int count=0;
        int p=0;
        String word="";
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                word=str.substring(p,i);
                System.out.println(word);
                p=i+1;
            }
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL= "+count);
    }
}