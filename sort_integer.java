import java.util.*;
class sort_integer
{
    public static void main()
    {
        int Names[];       
        int N;
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        N=sc.nextInt();
        Names=new int[N];
        System.out.println("Enter Names in the Array");
        for(int i=0;i<N;i++)
        {
            Names[i]=sc.nextInt();
        }
        System.out.println("Elements are= ");
        for(int i=0;i<N;i++)
        {
            System.out.println("\t"+Names[i]);
        }
        for(int i=0;i<N-1;i++)
        {
            int min=Names[i];
            int pos=i;
            for(int j=i+1;j<N;j++)
            {
                if(Names[j]<(min)) 
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