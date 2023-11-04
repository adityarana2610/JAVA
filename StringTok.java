import java.util.*;
class StringTok
{
    Scanner sc=new Scanner(System.in);
    String Str;
    void input()
    {
        System.out.println("Enter a sequence of tokens= ");
        Str=sc.nextLine();

    }
    void display()
    {
        StringTokenizer st=new StringTokenizer(Str);
        int count=st.countTokens();
        for(int i=1;i<=count;i++)
        {
            System.out.println(st.nextToken());
        }
    }  
    void longest()
    {
        StringTokenizer st1=new StringTokenizer(Str);
        String word="";
        int max=0;
        String word1="";
        while(st1.hasMoreTokens())
        {
            word=st1.nextToken();
            int l=word.length();
            if(max<=l)
            {
                max=l;
                word1=word;
            }
        }  
        System.out.println("Longest word: "+word1);
    }
    int sum()
    {
        Scanner sc=new Scanner(Str);
        StringTokenizer st=new StringTokenizer(Str);
        int count=st.countTokens();
        int c=0;
        for(int i=1;i<=count;i++)
        {
            if(!sc.hasNextInt())
                return -1;
            else
                c=c+1;
        }
        return c;
    }
    void main()
    {
        StringTok ob=new StringTok();
        ob.input();
        ob.display();
        ob.longest();
        System.out.println(ob.sum());
    }
}