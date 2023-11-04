import java.util.*;
class ddarray_diag
{
    public static void main()
    {   int Arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        int Lsum=0;
        int Rsum=0;
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                Arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    Lsum=Lsum+Arr[i][j];
                }
                if(i+j==3)
                {
                    Rsum=Rsum+Arr[i][j];
                }
            }
            
        }
        System.out.println("Array is= ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Sum of Elements of Left Diagonal= "+Lsum);
        System.out.println("Sum of Elements of Right Diagonal= "+Rsum);
    }
}