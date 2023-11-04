import java.util.*;
public class VowelWord
{
    Scanner sc=new Scanner(System.in);
    String str;
    int freq;
    VowelWord()
    {
        str="";
        freq=0;
    }
    void readstr()
    {
        System.out.println("Enter the Sentence");
        str=sc.nextLine();
        str=" "+str;
    }
    void freqvowel()
    {
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            if((ch==' ') && (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'))
            freq=freq+1;
        }
    }
    void display()
    {
        System.out.println("Original String=" +str);
        System.out.println("Frequence of words that begin with a vowel=" +freq);
    }
    public static void main(String args[])
    {
        VowelWord ob=new VowelWord();
        ob.readstr();
        ob.freqvowel();
        ob.display();
    }
}