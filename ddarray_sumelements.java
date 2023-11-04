import java.util.*;
class ddarray_sumelements
{
    public static void main()
    {
        int Arr[][]=new int[5][4];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                Arr[i][j]=sc.nextInt();
                sum=sum+Arr[i][j];
            }
        }
        System.out.println("Array is= ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the elements in the array= "+sum);
        
    }
}