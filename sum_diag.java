import java.util.*;
class sum_diag
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int Arr[][]=new int[4][4];
        int L=0;
        int R=0;
        System.out.println("Enter Elements in the Array= ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                Arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    L=L+Arr[i][j];
                }
                if(i+j==3)
                {
                    R=R+Arr[i][j];
                }
            }
        }
        System.out.println("Array is= ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Sum of elements of left diagonal= "+L);
        System.out.println("Sum of elements of right diagonal= "+R);
    }
}
        