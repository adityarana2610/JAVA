import java.util.*;
class q14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int n1=n;
        int s=0;
        while(n1>0)
        {
            int digit=n1%10;
            s=s+digit*digit*digit;
            n1=n1/10;
        }
        if(s==n)
        {
            System.out.println("Armstrong Number");
            
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}