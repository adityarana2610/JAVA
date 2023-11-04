import java.util.*;
public class MonoTonic
{
    Scanner sc=new Scanner(System.in);
    int arr[];
    int N;
    MonoTonic()
    {
        int arr[]= new int[N];
        N=0;
    }
    void read()
    {
        System.out.println("Enter the size of array= ");
        N=sc.nextInt();
        System.out.println("Enter elements of array= ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
    }
    void increasing()
    {
    }
    void decreasing()
    {
    }
    void main()
    {
        MonoTonic ob=new MonoTonic();
        ob.read();
        ob.increasing();
        ob.decreasing();
    }   
}
    
