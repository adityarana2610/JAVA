import java.util.*;
class Composite
{
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[20][20];
    int m,n;
    Composite(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    int isComposite(int p)
    {
        int count=0;
        for(int i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                count++;
            }
        }
        if(count!=2)
        return 1;
        else
        return 0;
    }
    void fill()
    {
        int r=0;
        int c=0;
        for(int k=2;k<2*m*n;k++)
        {
            int x=k;
            if(isComposite(x)==1)
            {
                arr[r][c++]=x;
                if(c==n)
                {
                    r++;
                    c=0;
                }
            }
            else
            {
                continue;
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Composite ob=new Composite(4,4);
        ob.fill();
        ob.display();
    }
}