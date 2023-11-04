import java.util.*;
class Fraction
{
    Scanner sc=new Scanner(System.in);
    int Num;
    int Den;
    Fraction(int n,int d)
    {
        Num=n;
        Den=d;
    }
    int HCF(int n1,int n2)
    {
        if(n2==0)
        return n1;
        return HCF(n2,n1%n2);
    }
    int LCM(int n1,int n2)
    {
        int hf=HCF(n1,n2);
        int lm=n1*n2/hf;
        return lm;
    }
    void reduce()
    {
        int gcd=HCF(Num,Den);
        Num=Num/gcd;
        Den=Den/gcd;
        System.out.println("Reduced Fraction= "+Num+"/"+Den);
    }
    void main()
    {
        Fraction ob=new Fraction(2,4);
        System.out.println("HCF= "+ob.HCF(2,4));
        System.out.println("LCM= "+ob.LCM(2,4));
        ob.reduce();
    }
}