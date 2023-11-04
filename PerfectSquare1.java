import java.util.*;
class PerfectSquare1
{
    Scanner sc=new Scanner(System.in);
    int N;
    PerfectSquare1()
    {
        int N=0;
    }
    void read()
    {
        System.out.println("Enter the value of N= ");
        N=sc.nextInt();
    }
    void multiply()
    {
        while((int)Math.sqrt(N)==Math.sqrt(N)&& N>1)
        {
            N=(int)(Math.sqrt(N));
        }
        for(int i=(int)(Math.sqrt(N));i>1;i--)
        {
           
            while(N%(i*i)==0)
            N/=i;
        }
    }
    void display()
    {
        System.out.println("The Square root of the number N= " +N);
    }
    void main()
    {
        PerfectSquare1 ob=new PerfectSquare1();
        ob.read();
        ob.multiply();
        ob.display();
    }
}