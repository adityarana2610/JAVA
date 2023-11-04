import java.util.*;
class WordWise1
{
    Scanner sc=new Scanner(System.in);
    String str;
    WordWise1()
    {
        str="";
    }
    void readsent()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
    }
    int freq_vowel(String w)
    {
        int c=0;
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            char ch1=Character.toUpperCase(ch);
            if(ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U')
            {
                c++;
            }
        }
        return c;
    }
    void arrange()
    {
        String s=str+" ";
        String word="";
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                word=str.substring(a,i);
                System.out.println(word);
                System.out.println(freq_vowel(word));
                a=i+1;
            }
        }
    }
    public static void main(String args[])
    {
        WordWise1 ob=new WordWise1();
        ob.readsent();
        ob.arrange();
    }
}