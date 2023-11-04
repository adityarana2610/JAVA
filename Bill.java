import java.util.*;
class Bill extends Detail
{
    Scanner sc=new Scanner(System.in);
    int n;
    double amt;
    Bill(String b,String a,int t,double r,int y)
    {
        super(b,a,t,r);
        n=y;
        amt=0.0;
    }
    void cal()
    {
        if(n>=1 && n<=100)
        {
            amt=rent;
        }
        else if(n>=101 && n<=200)
        {
            amt=(n-100)*0.6+rent;
        }
        else if(n>=201 && n<=300)
        {
            amt=(100*0.6)+(n-200)*0.8+rent;
        }
        else if(n>300)
        {
            amt=(100*0.6)+(100*0.8)+(n-300)*1.0+rent;
        }
    }
    void show()
    {
        super.show();
        System.out.println("Number of calls= "+n);
        System.out.println("Amount to be paid= "+amt);
    }
}
