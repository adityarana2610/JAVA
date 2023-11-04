import java.util.*;
class Goldbach
{
    Scanner sc=new Scanner(System.in);
    int N;
    Goldbach()
    {
        N=0;
    }
    void read()
    {
        System.out.println("Enter Value of N: ");
        N=sc.nextInt();
        if(N<=9 || N>=50)
        {
            System.out.println("INVALID INPUT.NUMBER OUT OF RANGE");
            return;
        }
        if(N%2!=0)
        {
            System.out.println("INVALID INPUT.NUMBER IS ODD.");
            return;
        }
    }
    boolean Prime(int num)
    {
        int c=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    void calculate()
    {
        int a=3;
        int b=0;
        while(a<=N/2)
        {
            b=N-a;
            if((Prime(a) && Prime(b)))
            
                System.out.println(a+"  ,  "+b);
                a=a+2;
            
        }
    }

    void main()
    {
        Goldbach ob=new Goldbach();
        ob.read();
        ob.calculate();
    }
}