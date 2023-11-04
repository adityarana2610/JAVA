import java.util.*;
class LongestWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter a Sentence= ");
        s=sc.nextLine();
        System.out.println(s);
        s=s+" ";
        String word="";
        String word1="";
        int p=0;
        int l=0;
        int a=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                word=s.substring(p,i);
                System.out.println(word);
                l=word.length();
                if(max<l)
                {
                    max=l;
                    word1=word;
                    a=max;
                    word="";
                }
           }
        
           p=i+1;
        } 
        System.out.println("The length of the longest word is= "+a);
    }
}
