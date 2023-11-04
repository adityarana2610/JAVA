import java.util.*;
class dec
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter number of rows= ");
        int M=sc.nextInt();
        System.out.println("Enter number of columns= ");
        int N=sc.nextInt();
        if(M<=0 || M>=10 || N<=2 || N>=6)
        { 
            System.out.println("OUT OF RANGE"); 
            return;
        }
        int A[][]=new int[M][N];
        System.out.println("Enter the Elements Row wise= ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
                if(A[i][j]<0 || A[i][j]>7)
                {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }
        for(int i=0;i<M;i++)
        {
            int decimal=0;
            for(int j=0;j<N;j++)
            {
                decimal=decimal+A[i][j]*(int)(Math.pow(8,N-j-1));
                System.out.print(A[i][j]+" ");
            }
            System.out.print(decimal);
            System.out.println();

        }
    }
}
