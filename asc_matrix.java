import java.util.*;
class asc_matrix
{
    Scanner sc=new Scanner(System.in);
    int A[][];
    int M;int N;
    
    void read()
    {
        
        System.out.println("Enter Value of M: ");
        M=sc.nextInt();
        System.out.println("Enter Value of N: ");
        N=sc.nextInt();
        if((M<=2 || M>=10) || (N<=2 || N>=10))
        {
            System.out.println("MATRIX SIZE OUT OF RANGE");
            return;
        }
        int A[][]=new int[M][N];
        System.out.println("Enter Elements of Matrix: ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }
    int arr[]=new int[M];
    void sort()
    {

        int temp=0;
        for(int i=0;i<M;i++)
        {
            arr[i]=A[0][i++];
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    void display()
    {
        System.out.println("SORTED ROW :");
        for(int i=0;i<M;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void main()
    {
        asc_matrix ob=new asc_matrix();
        ob.read();
        ob.sort();
        ob.display();
    }
}