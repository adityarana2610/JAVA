import java.util.*;
class q18
{
    Scanner sc=new Scanner(System.in);
    int A[][];
    int M;
    void main()
    {
        System.out.println("Enter Value of M= ");
        M=sc.nextInt();
        if(M<=2 || M>=10)
        {
            System.out.println("INVALID INPUT");
        }
        int A[][]=new int [M][M];
        System.out.println("Enter Elements in Array= ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<M;i++)
        {
            for(int j=i;j<M;j++)
            {
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M/2;j++)
            {
                int temp=A[i][j];
                A[i][j]=A[i][M-1-j];
                A[i][M-1-j]=temp;
            }
        }
        System.out.println("MATRIX AFTER ROTATION");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        sum=A[0][0]+A[0][M-1]+A[M-1][0]+A[M-1][M-1];
        System.out.println("Sum of the corner sum elements= "+sum);
    }
}