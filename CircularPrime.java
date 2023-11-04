import java.util.*;
class CircularPrime
{
    Scanner sc=new Scanner(System.in);
    int n;
    void main()
    {
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        if(n<=1)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                 c++;
            }
        }
        while(n>0)
        {
            c++;
            n=n/10;
        }
        int x=(int)(Math.pow(10,c-1));
        boolean flag=true;
        for(int i=1;i<c;i++)
        {
            n=(n%x)*10+(n/x);
            if(n%i!=0)
            {
                flag=false;
                break;
            }
            System.out.println(n);
        }
        if(flag==true)
        {
            System.out.println("CIRCULARPRIME");
        }
        else
        {
            System.out.println("NOT CIRCULAR PRIME");
        }
    }
}