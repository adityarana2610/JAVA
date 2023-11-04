import java.util.*;
class Rearrange
{
    Scanner sc=new Scanner(System.in);
    int Arr[];
    int N;
    Rearrange()
    {
        Arr=new int[10];
    }
    void enter()
    {
        System.out.println("Enter Size of Array= ");
        N=sc.nextInt();
        System.out.println("Enter the array= ");
        for(int i=0;i<N;i++)
        {
            Arr[i]=sc.nextInt();
        }
    }
    void insert(int p,int item)
    {
        for(int i=N-1;i>=p;i--)
        {
            Arr[i+1]=Arr[i];
        }
        Arr[p]=item;
        N++;
    }
    void display()
    {
        for(int i=0;i<N;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
    void remove(int p)
    {
        for(int i=p+1;i<N;i++)
            Arr[i-1]=Arr[i];
            N--;
    }
}
