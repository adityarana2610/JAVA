import java.util.*;
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
