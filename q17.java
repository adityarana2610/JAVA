import java.util.*;
class q17
{
    Scanner sc=new Scanner(System.in);
    String str="";
    void main()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
        int len=str.length();
        char ch=str.charAt(len-1);
        if(ch!='.' && ch!='?')
        {
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.println("Words  Vowels  Consonants");
        int p=0;
        String word="";
        int con=0;
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                word=str.substring(p,i);
                int l=word.length();
                int vowel=0;
                for(int j=0;j<l;j++)
                {
                    ch=word.charAt(j);
                    if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                    {
                        vowel=vowel+1;
                    }
                    con=l-vowel;
                }
                word=Character.toUpperCase(word.charAt(0))+word.substring(1,l);
                System.out.println(word+"     "+vowel+"       "+con);
                p=i+1;
            }
        }
    }
}

