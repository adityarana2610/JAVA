import java.util.*;
class Merger
{
    Scanner sc=new Scanner(System.in);
    long n1;
    long n2;
    long mergNum;
    Merger()
    {
        n1=0;
        n2=0;
        mergNum=0;
    }
    void readNum()
    {
        System.out.println("Enter First Number= ");
        n1=sc.nextLong();
        System.out.println("Enter Second Number= ");
        n2=sc.nextLong();
    }
    void JoinNum()
    {
        String s1=Long.toString(n1);
        String s2=Long.toString(n2);
        String s=s1+s2;
        mergNum=Long.valueOf(s);
    }
    void show()
    {
        System.out.println("First Number= "+n1);
        System.out.println("Second Number= "+n2);
        System.out.println("Merged Number= "+mergNum);
    }
    public static void main()
    {
        Merger ob=new Merger();
        ob.readNum();
        ob.JoinNum();
        ob.show();
    }
}