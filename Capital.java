import java.util.*;
 class Capital
{
    Scanner sc=new Scanner(System.in);
    String sent;
    int freq;
    Capital()
    {
        sent="";
        freq=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
        sent=sent+" ";
    }
    boolean isCap(String w)
    {
        char ch=w.charAt(0) ;
        if (Character.isUpperCase(ch)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void display()
    {
        System.out.println("Original sentence="+sent);
        String wd="";
        char ch=' ';
        for (int i=0;i< sent.length();i++)
         {
            ch=sent.charAt(i);
            if(ch==' ')
            {
                if(isCap(wd)==true)
                {
                    freq=freq+1;
                }
                wd="";
            }
            else
            {
                wd=wd+ch;
            }
        }
        System.out.println("Freqency of word="+freq) ;
    }
    public static void main()
    {
        Capital ob=new Capital();
        ob.input();
        ob.display();
    }
}