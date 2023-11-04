import java.util.*;
class Pseudoarithmetic
{
    Scanner sc=new Scanner(System.in);
    int n;
    int a[];
    boolean ans;
    boolean flag;
    int sum;
    int r;
    Pseudoarithmetic()
    {
        n=0;
        sum=0;
        r=0;
        ans=true;
        flag=true;
    }

    void accept(int nn)
    {
        n=nn;
        a=new int[n];
        System.out.println("Enter Elements in the Array= ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    boolean check()
    {

        sum=a[0]+a[n-1];
        for(int i=1,j=n-2;i<n/2;i++,j--)
        {
            if(sum!=(a[i]+a[j]))
            {
                ans=false;
                break;
            }
        }
        if((n%2!=0)&&(sum!=(a[n/2]*2)))
            ans=false;
        if(ans==true)
        {
            if(n%2==0)
                r=n/2;
            else
                r=n/2+1;
            sum=sum*r;
            System.out.println("Sum of Sequences= "+sum);
        }

        return ans;
    }

    public static void main()
    {
        Pseudoarithmetic ob=new Pseudoarithmetic();
        ob.accept(6);
        boolean x=ob.check();
        if(x==true)
        {
            System.out.println("Pseudoarithmetic Sequence");
        }
        else
        {
            System.out.println("Not Pseudoarithmetic Sequence");
        }
    }
}