import java.util.*;
class RecordData
{
    Scanner sc=new Scanner(System.in);
    String name[];
    int rank[];
    RecordData()
    {
        name=new String[5];
        rank=new int[5];
    }
    void readvalues()
    {
        System.out.println("Enter the Names: ");
        for(int i=0;i<5;i++)
        {
            name[i]=sc.next();
        }
        System.out.println("Enter the Ranks: ");
        for(int i=0;i<5;i++)
        {
            rank[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("Names: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(name[i]+" ");
        }
        System.out.println("Ranks: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(rank[i]+" ");
        }
    }
}
class Rank extends RecordData
{
    Scanner sc=new Scanner(System.in);
    int Index;
    Rank()
    {
        super();
        Index=0;
    }
    void highest()
    {
        int max=rank[0];
        for(int i=1;i<5;i++)
        {
            if(max<rank[i])
            {
                max=rank[i];
                Index=i;
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("Name of Topmost rank is: "+name[Index]);
    }
}