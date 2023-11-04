import java.util.*;
class OddEven1
{
    Scanner sc=new Scanner(System.in);
    int a[];
    int m;
    OddEven1(int mm)
    {
        m=mm;
        a=new int[m];
    }
    void fillarray()
    {
        System.out.println("Enter the Elements: ");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    OddEven1 arrange(OddEven1 P,OddEven1 Q)
    {
        OddEven1 R=new OddEven1(P.m+Q.m);
        int k=0;
        for(int i=0;i<P.m;i++)
        {
            if(P.a[i]%2==1)
            {
                R.a[k++]=P.a[i];
            }
        }
        for(int i=0;i<Q.m;i++)
        {
            if(Q.a[i]%2!=0)
            {
                R.a[k++]=Q.a[i];
            }
        }
        for(int i=0;i<P.m;i++)
        {
            if(P.a[i]%2==0)
            {
                R.a[k++]=P.a[i];
            }
        }
        for(int i=0;i<Q.m;i++)
        {
            if(Q.a[i]%2==0)
            {
                R.a[k++]=Q.a[i];
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
        OddEven1 ob=new OddEven1(7);
        OddEven1 ob1=new OddEven1(6);
        ob.fillarray();
        ob1.fillarray();
        OddEven1 ob2=arrange(ob,ob1);
        ob2.display();
    }
}