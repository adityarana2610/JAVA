import java.util.*;
class Sort
{
    public static void main()
    {
        String Names[];       
        int N;
        String t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        N=sc.nextInt();
        Names=new String[N];
        System.out.println("Enter Names in the Array");
        for(int i=0;i<N;i++)
        {
            Names[i]=sc.next();
        }
        System.out.println("Elements are= ");
        for(int i=0;i<N;i++)
        {
            System.out.println("\t"+Names[i]);
        }
        for(int i=0;i<N-1;i++)
        {
            String min=Names[i];
            int pos=i;
            for(int j=i+1;j<N;j++)
            {
                if(Names[j].compareTo(min)<0)
                {
                    min=Names[j];
                    pos=j;
                }
                t=Names[i];
                Names[i]=Names[pos];
                Names[pos]=t;
            }
        }
        System.out.println("Elements in Ascending order are= ");
        for(int i=0;i<N;i++)
        {
            System.out.println("\t"+Names[i]);
        }
    }
}