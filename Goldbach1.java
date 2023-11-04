import java.util.*;
public class Goldbach1
{
    int isPrime(int num)
    {
        int c = 0;
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                c++;
            }
        }
        return c=2;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in); int n=0;
        System.out.println("enter number to be checked");
        n=sc.nextInt();
        if (n<=9 || n>=50 || n%2==1 || n<0)
        {
            System.out.println("invalid input");
            return;
        }
        System.out.println("PRIME PAIRS ARE:");
        int a=3;
        int b=0;
        while(a<=n/2)
        {
            b=n-a;
            if((isPrime(a)==2&&isPrime(b)==2))
                System.out.println(a+"  ,  "+b);
            a=a+2;
        }
    }
}