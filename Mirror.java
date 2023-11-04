import java.util.*;
class Mirror
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int M=sc.nextInt();
        if(M<=2 || M>=20)
        {
            System.out.println("SIZE OUT OF RANGE");
            return;
        }
        int A[][]=new int[M][M];
        System.out.println("Enter Elements in Array: ");
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
        int arr[][]=new int[M][M];
        for(int j=0;j<M;j++)
        {
            for(int i=0;i<M;i++)
            {
                arr[i][M-1-j]=A[i][j];
            }
        }
        System.out.println("MIRROR IMAGE MATRIX");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}