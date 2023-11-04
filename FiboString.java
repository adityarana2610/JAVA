import java.util.*;
class FiboString
{
    Scanner sc=new Scanner(System.in);
    String x;String y;String z;int n;
    FiboString()
    {
        x="a";
        y="b";
        z="ba";
        n=0;
    }
    void accept()
    {
        System.out.println("Enter Number of Terms: ");
        n=sc.nextInt();
    }
    void generate()
    {
        System.out.print(x+","+y);
        for(int i=0;i<n-2;i++)
        {
            System.out.print(","+z);
            x=y;
            y=z;
            z=y+x;
        }
    }
    void main()
    {
        FiboString ob=new FiboString();
        ob.accept();
        ob.generate();
    }
}