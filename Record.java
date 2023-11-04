import java.util.*;
class Record
{
    Scanner sc=new Scanner(System.in);
    String names[];
    int rnk[];
    Record()
    {
        names=new String[5];
        rnk=new int[5];
    }
    void readvalues()
    {
        System.out.println("Enter the names of students and rank= ");
        for(int i=0;i<5;i++)
        {
            names[i]=sc.next();
            rnk[i]=sc.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(" Name "+names[i]+" Rank "+rnk[i]);
        }
    }
}
class Rank extends Record
{
    int index;
    Rank()
    {
        super();
        index=0;
    }
    void highest()
    {
        int max=rnk[0];
        index=0;
        for(int i=1;i<5;i++)
        {
            if(max<rnk[5])
            {
                index=i;
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("Name of topmost ranker= "+names[index]);
    }
}