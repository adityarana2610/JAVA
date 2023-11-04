import java.util.*;
class OddEven
{
    Scanner sc=new Scanner(System.in);
    int a[];
    int m;
    OddEven(int mm)
    {
        m=mm;
        a=new int[m];
    }
    void fillarray()
    {
        System.out.println("Enter Elements in Array: ");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    OddEven arrange(OddEven P,OddEven Q)
    {
        OddEven R=new OddEven(P.m+Q.m);
        int k=0;
        m=P.m+Q.m;
        for(int i=0;i<P.m;i++)
        {
            if(P.a[i]%2==1)
            {
                R.a[k++]=P.a[i];
            }
        }
        for(int j=0;j<Q.m;j++)
        {
            if(Q.a[j]%2==1)
            {
                R.a[k++]=Q.a[j];
            }
        }
        for(int i=0;i<P.m;i++)
        {
            if(P.a[i]%2==0)
            {
                R.a[k++]=P.a[i];
            }
        }
        for(int j=0;j<Q.m;j++)
        {
            if(Q.a[j]%2==0)
            {
                R.a[k++]=Q.a[j];
            }
        }
        return R;
    }
    void display()
    {
        System.out.println("Arranged Array: ");
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void main()
    {
        OddEven ob1=new OddEven(7);
        OddEven ob2=new OddEven(6);
        ob1.fillarray();
        ob2.fillarray();
        OddEven ob3=arrange(ob1,ob2);
        ob3.display();
    }
}