import java.util.*;
class Pronic1
{
    Scanner sc=new Scanner(System.in);
    int num;
    Pronic1()
    {
        num=0;
    }
    void acceptnum()
    {
        System.out.println("Enter a Positive Number: ");
        num=sc.nextInt();
    }
    boolean ispronic(int v)
    {
        for(int i=1;i<v;i++)
        {
            if(i*(i+1)==v)
            {
                return true;
            }
        }
        return false;
    }
    void check()
    {
        if(ispronic(num))
        {
            System.out.println("NUMBER PRONIC");
        }
        else
        {
            System.out.println("NUMBER IS NOT PRONIC");
        }
    }
    void main()
    {
        Pronic ob=new Pronic();
        ob.acceptnum();
        ob.check();
    }
}