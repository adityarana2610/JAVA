import java.util.*;
class ddarray_sumrowscolums
{
    public static void main()
    {   int Arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        int R=0;
        int C=0;
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                Arr[i][j]=sc.nextInt();
                
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
        System.out.println("The sum of elements of each row: ");
        for(int i=0;i<4;i++)
        {
            R=0;
            for(int j=0;j<4;j++)
            {
                R=R+Arr[i][j];
            }
            System.out.println("The sum of elements of " +(i+1)+ " row:" +R);
        }
        System.out.println("The sum of elements of each column: ");
        for(int i=0;i<4;i++)
        {
            C=0;
            for(int j=0;j<4;j++)
            {
                C=C+Arr[j][i];
            }
            System.out.println("The sum of elements of " +(i+1)+ " column:" +C);
        }
    }
}