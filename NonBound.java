import java.util.*;
class NonBound
{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    int n;
    NonBound(int mm)
    {
        n=mm;
        arr=new int[n][n];
    }
    void fillarray()
    {
        System.out.println("Enter the Elements= ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void sum_of_non()
    {
        int sum=0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                sum=arr[i][j];
            }
        }
        System.out.println("Sum of Non Boundary Elements= "+sum);
    }
    void display()
    {
        System.out.println("Array Elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.println
        NonBound ob=new NonBound(n);
        ob.fillarray();
        ob.sum_of_non();
        ob.display();
    }
}