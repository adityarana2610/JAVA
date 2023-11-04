import java.util.*;
class ArrangeNum
{
    Scanner sc=new Scanner(System.in);
    int n;
    int s[];
    ArrangeNum(int nn)
    {
        n=nn;
        int len=0;
        for(int i=n;i>0;i/=10)
        len=len+1;
        s=new int[len];
    }
    void fill_array()
    {
        for(int i=0;i<s.length;i++)
        {
            int n1=n;
            s[i]=n1%10;
            n=n1/10;
        }
    }
    void arrange()
    {
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s.length-1;j++)
            {
                if(s[j]>s[j+1])
                {
                    int temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
    void show()
    {
        System.out.println("The Original Number= "+n);
        System.out.println("Sorted array of the Number= ");
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
        System.out.println();
    }
    public void main()
    {
        ArrangeNum ob=new ArrangeNum(n);
        ob.fill_array();
        ob.arrange();
        ob.show();
    }
}
