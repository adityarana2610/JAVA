import java.util.*;
class length
{
    Scanner sc=new Scanner(System.in);
    String str="";
    void check()
    {
        System.out.println("Enter a Sentence= ");
        str=sc.nextLine();
        int count=0;
            if(str.charAt(str.length()-1)=='.' ||str.charAt(str.length()-1)=='!' ||str.charAt(str.length()-1)=='?')
        {
                System.out.println("Valid Sentence");
        }
        else
        {
                System.out.println("Invalid Sentence");
        }
    }
    void length()
    {
        StringTokenizer st=new StringTokenizer(str);
        int word=st.countTokens();
        String a[]=new String[word];
        for(int i=0;i<word;i++)
        {
            a[i]=st.nextToken();
        }
        for(int i=0;i<word-1;i++)
        {
            for(int j=0;j<word-i-1;j++)
            {
                if(a[j].length()>a[j+1].length())
                {
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<word;i++)
        {
             
        }
        System.out.println("Sorted String is= ");
        for(int i=0;i<word;i++)
            System.out.print(a[i]+" ");
    }
}
