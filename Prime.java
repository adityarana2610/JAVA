import java.util.*;
class Prime
{
    Scanner sc=new Scanner(System.in);
    int n[];
    int y[];
    Prime()
    {
        n=new int[25];
        y=new int[25];
        for(int i=0;i<25;i++)
        {
            n[i]=0;
            y[i]=0;
        }
    }
    void input()
    {
        for(int i=0;i<25;i++)
        {
            System.out.println("Enter a Number= ");
            n[i]=sc.nextInt();
        }
    }
    void fre()
    {
        for(int i=0;i<25;i++)
        {
            y[i]=0;
            for(int j=1;j<n[i];j++)
            {
                if(n[i]%j==0 && isPrime(j)==1)
                {
                    y[i]+=1;
                }
            }
        }
    }
    int isPrime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    void result()
    {
        System.out.println("Number \t frequency");
        for(int i=0;i<25;i++)
        {
            System.out.println(n[i]+"\t"+y[i]);
        }
    }
    public static void main()
    {
        Prime ob=new Prime();
        ob.input();
        ob.fre();
        ob.result();
    }
} 