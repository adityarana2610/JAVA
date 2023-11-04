import java.util.*;
public class Convert
{
    Scanner sc=new Scanner(System.in);
    int M;
    public void read()
    {
        System.out.println("Enter a Number in octal base= ");
        M=sc.nextInt();
    }
    void octtodec()
    {
        int p=0;int d;double sum=0;int M1=M;
        while(M!=0)
        {
            d=M%10;
            sum=sum+d*Math.pow(8,p);
            M=M/10;
            p=p+1;
        }
        System.out.println(M1+" in decimal is "+(int)sum);
    }
    static void main()
    {
        Convert ob=new Convert();
        ob.read();
        ob.octtodec();
    }
}