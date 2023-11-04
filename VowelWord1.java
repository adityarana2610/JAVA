import java.util.*;
public class VowelWord1
{
    Scanner sc=new Scanner(System.in);
    String str;
    int freq;
    VowelWord1()
    {
        str="";
        freq=0;
    }
    void readstr()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
        str=" "+str;
    }
    void freqvowel()
    {
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            char ch2=str.charAt(i+1);
            if((ch==' ') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'))
            freq=freq+1;
        
       }
    }
    void display()
    {
        System.out.println("The Original String= "+str);
        System.out.println("Frequency of vowels that begin with a vowel= "+freq);
    }
    public static void main(String args[])
    {
        VowelWord1 ob=new VowelWord1();
        ob.readstr();
        ob.freqvowel();
        ob.display();
        
    }
}
    