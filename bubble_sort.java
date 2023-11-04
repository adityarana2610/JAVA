import java.util.*;
class bubble_sort
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
             
        
            
            for(int j=0;j<(N-1-i);j++)
            {
                if(Names[j].compareTo(Names[j+1])>0)
                {
                    t=Names[j];
                    Names[j]=Names[j+1];
                    Names[j+1]=t;
                }
        }
        }
        System.out.println("Elements in Descending Order are= ");
        
        for(int i=0;i<N;i++)
        {
            System.out.println("\t"+Names[i]);
        }
    }
}