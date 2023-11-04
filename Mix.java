import java.util.*;
class Mix
{
    Scanner sc=new Scanner(System.in);
    String wrd;
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        System.out.println("ENTER THE WORD: ");
        wrd=sc.next();
        len=wrd.length();
    }
    void mix_word(Mix P,Mix Q)
    {
        for(int i=0;i<len;i++)
        {
            wrd=wrd+P.wrd.charAt(i)+Q.wrd.charAt(i);
            if(P.len>Q.len)
            {
                wrd=wrd+P.wrd.substring(Q.len);
            }
            else
            {
                wrd=wrd+P.wrd.substring(P.len);
            }
        }
    }
    void display()
    {
        System.out.println("WORD IS: "+wrd);
    }
    void main()
    {
        Mix M1=new Mix();
        Mix M2=new Mix();
        Mix M=new Mix();
        M1.feedword();
        M2.feedword();
        M.mix_word(M1,M2);
        M.display();
    }
}