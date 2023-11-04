import java.util.*;
class sumprime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            int c=0;
            for(int i=1;i<=d;i++)
            {
                if(d%i==0)
                c++;
            }
            if(c==2)
            {
                s=s+d;
            }
        }
        System.out.println("Sum of prime digits= "+s);
    }
}