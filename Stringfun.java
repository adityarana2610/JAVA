import java.util.*;
class Stringfun
{
    Scanner sc=new Scanner(System.in);
    String str;
    void input()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
    }
    void words()
    {
        char c;
        int count=1;
        int v=0;
        int u=0;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(c==' ')
            count++;
             
            
                if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
                v++;
            
             if(Character.isUpperCase(c))
             u++;

        }
        System.out.println("No of words= "+count);
        System.out.println("No of uppercase letter= "+u);
        System.out.println("No of vowels= "+v);
    }
    void frequency()
    {
       int c[]=new int[26];
       for(int i=0;i<26;i++)
       {
           c[i]=0;
           for(i=0;i<str.length();i++)
           {
              char ch;
              ch=str.charAt(i);
              for(int j=0;j<str.length();j++)
              {
                  if(ch==str.charAt(j))
                  c[i]++;
              }
           
       }
    }
    for(int i=0;i<26;i++)
    {
        char ch1=(char)(65+i);
        char ch2=(char)(97+i);
        for(int j=0;j<str.length();j++)
        {
            if(ch1==str.charAt(j) || ch2==str.charAt(j))
            {
                System.out.println("frequency of" +str.charAt(j)+ "is"+c[j]);
                break;
            }
        }
    }
   }
    public static void main()
    {
        Stringfun ob=new Stringfun();
        ob.input();
        ob.words();
        ob.frequency();
    }
}
