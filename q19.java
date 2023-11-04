import java.util.*;
class q19
{
    Scanner sc=new Scanner(System.in);
    int A[][];
    int M;
    void main()
    {
        System.out.println("Enter Value of M= ");
        M=sc.nextInt();
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
        int flag=0;
        for(int i=1;i<M;i++)
        {
            if(A[i][i]!=A[0][0])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("SCALAR MATRIX");
        }
        else
        {
            System.out.println("NOT A SCALAR MATRIX");
        }
        
    }
}