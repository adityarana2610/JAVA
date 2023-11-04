import java.util.*;
class Automorphic1
{
    Scanner sc=new Scanner(System.in);
    static int N;
    Automorphic1()
    {
        int N=0;
    }
    Automorphic1(int x)
    {
        N=x;
    }
    void read()
    {
        System.out.println("Enter the value of N= ");
        N=sc.nextInt();
    }
    int square(int n)
    {
       return(n*n);
    }
    void check()
    {
        int c=0;
        int t=N;
        while(t!=0)
        {
            int d=t%10;
            t=t/10;
            c=c+1;
        }
       int y=(int)(Math.pow(10,c));
       int m=square(N)%y;
       if(m==N)
       System.out.println("Automorphic");
       else
       System.out.println("Not Automorphic");
    }
    static void main()
    {
        Automorphic1 ob=new Automorphic1();
        ob.read();
        ob.square(N);
        ob.check();
    }
}