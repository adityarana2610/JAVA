import java.util.*;
class DeciOct
{
    Scanner sc=new Scanner(System.in);
    int n;
    int oct;
    DeciOct()
    {
        n=0;
        oct=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    void deci_oct()
    {
        if(n==0)
        {
            return;
        }
        oct=oct*10+n%8;
        n=n/8;
        deci_oct();
    }
    void show()
    {
        System.out.println("Decimal Number= "+n);
        deci_oct();
        n=oct;
        oct=0;
        while(n>0)
        {
            oct=oct*10+n%10;
            n=n/10;
        }
        System.out.println("Octal Equivalent= "+oct);
    }
    public static void main()
    {
        DeciOct ob=new DeciOct();
        ob.getnum(102);
        ob.show();
    }
}