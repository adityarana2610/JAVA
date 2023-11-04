import java.util.*;
class Frequency
{
    Scanner sc=new Scanner(System.in);
    String text;
    int countand;
    int countan;
    int len;
    Frequency()
    {
        text="";
        countand=0;
        countan=0;
        len=0;
    }

    void accept(String n)
    {
        n=n.toLowerCase();
        text=n;
    }

    void checkandfreq()
    {
        StringTokenizer st=new StringTokenizer(text);
        int c=st.countTokens();
        String s="";
        for(int i=1;i<=c;i++)
        {
            s=st.nextToken();
            if(s.equals("and"))
            {
                countand++;
            }
        }
    }
    void checkanfreq()
    {
        StringTokenizer st=new StringTokenizer(text);
        int c=st.countTokens();
        String s="";
        for(int i=1;i<=c;i++)
        {
            s=st.nextToken();
            if(s.equals("an"))
            {
                countan++;
            }
        }
    }
    void display()
    {
        System.out.println("Number of and= "+countand);
        System.out.println("Number of an= "+countan);
    }
    public static void main(String args[])
    {
        Frequency ob=new Frequency();
        ob.accept("ANDY LIKES CANDY AND CHOCOLATE AND AN APPLE");
        ob.checkandfreq();
        ob.checkanfreq();
        ob.display();
    }
}