import java.util.*;
class ddarray_transpose
{
    public static void main()
    {   int Arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
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
        System.out.println("Transpose of Matrix= ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[j][i] +" ");
            }
            System.out.println();
        }
        
    }
}