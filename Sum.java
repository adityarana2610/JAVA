import java.util.*;
class sum
{
    public static void main()
    {
        int Arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int r=0;
        int c=0;
        System.out.println("Enter Elements in the Array= ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is= " +Arr[r][c]);
        for(int i=0;i<r;i++)
        {
            int sum=0;
            for(int j=0;j<c;j++)
            {
                System.out.print("\t" +Arr[i][j]);
                sum=sum+Arr[i][j];
            }
            for( i=0;i<3;i++)
            {
                c=0;
                for(int j=0;j<3;j++)
                {
                    c=c+Arr[j][i];
            }
        }
        System.out.println("Sum of rows= " +sum);
        System.out.println("Sum of columns= " +c);
        }
    }
}