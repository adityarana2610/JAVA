import java.util.*;
class Array2Dim
{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    int a;
    int b;
    Array2Dim(int aa,int bb)
    {
        a=aa;
        b=bb;
        arr=new int[a][b];
    }
    void input()
    {
        System.out.println("Enter Elements in Array: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    Array2Dim Subarray(Array2Dim A)
    {
        Array2Dim B=new Array2Dim(a,b);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                B.arr[i][j]=arr[i][j]-A.arr[i][j];
            }
        }
        return B;
    }
    void print()
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    void main()
    {
        System.out.println("Enter Size of Array: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Array2Dim A=new Array2Dim(m,n);
        Array2Dim B=new Array2Dim(m,n);
        Array2Dim C=new Array2Dim(m,n);
        A.input();
        B.input();
        C=A.Subarray(B);
        C.print();
    }
}