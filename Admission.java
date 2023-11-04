import java.util.*;
class Admission
{
    Scanner sc=new Scanner(System.in);
    int Adno[];
    public Admission(int size)
    {
        Adno=new int[size];
    }
    void fillArray()
    {
        System.out.println("Enter the Sorted Elements= ");
        int size=Adno.length;
        for(int i=0;i<size;i++)
        {
            Adno[i]=sc.nextInt();
        }
    }
    int binSearch(int l,int u,int v)
    {
        if(l>u)
        return -1;
        else
        {
            int mid=(u+l)/2;
            if(Adno[mid]==v)
            return 1;
            else
            {
                if(v<Adno[mid])
                u=mid-1;
                else if(v>Adno[mid])
                l=mid+1;
            }
            return binSearch(l,u,v);
        }
    }
    void main()
    {
        Admission ob=new Admission(10);
        ob.fillArray();
        int x=ob.binSearch(0,9,15);
        if(x==1)
        System.out.println("found");
        else
        System.out.println("not found");
    }
}