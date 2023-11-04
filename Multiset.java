import java.util.*;
class Multiset
{
    Scanner sc=new Scanner(System.in);
    int Arr[];
    int size;
    Multiset()
    {
        Arr=new int[5];
        size=5;
    }
    void readList()
    {
        System.out.println("Enter the array size = ");
        size=sc.nextInt();
        System.out.println("Enter the elements= ");
        for(int i=0;i<size;i++)
        {
            Arr[i]=sc.nextInt();
        }
    }
    void displayList()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(Arr[i]+" " );
        }
    }
    int Set()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(Arr[i]==Arr[j])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    void convert()
    {
        int temp[]=new int[size];
        int j=0;
        for(int i=0;i<size-1;i++)
        {
            if(Arr[i]!=Arr[i+1])
            {
                temp[j++]=Arr[i];
            }
        }
        temp[j++]=Arr[size-1];
        for(int i=0;i<j;i++)
        {
            System.out.println(temp[i]+" ");
        }
    }
    void main()
    {
        Multiset ob=new Multiset();
        ob.readList();
        ob.displayList();
        if(ob.Set()==0)
        System.out.println("Not a Set");
        else if(ob.Set()==1)
        System.out.println("Set");
        ob.convert();
    }
}