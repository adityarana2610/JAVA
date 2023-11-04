import java.util.*;
class WordWise
{
    Scanner sc=new Scanner(System.in);
    String str;
    WordWise()
    {
        str="";
    }
    void readSent()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
    }
    int freq_vowel(String w)
    {
        int count=0;
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            char ch1=Character.toUpperCase(ch);
            if(ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U')
            {
                count++;
            }
        }
        return count;
    }
    void arrange()
    {
        String s=str+"";
        String word="";
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
             word=str.substring(p,i);
             System.out.println(word);
             System.out.println(freq_vowel(word));
             p=i+1;
            }
        }
    }
    public static void main(String args[])
    {
        WordWise ob=new WordWise();
        ob.readSent();
        ob.arrange();
    }
}