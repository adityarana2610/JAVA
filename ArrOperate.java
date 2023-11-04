import java.util.*;
class ArrOperate
{
      public static void main()
{
    int Arr[][];
    int R,C;
    int N;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of rows : ");
R=sc.nextInt();
System.out.print("Enter Number of Columns : ");
C=sc.nextInt();
System.out.print("Enter the value of N : ");
N=sc.nextInt();
Arr=new int[R][C];
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
Arr[i][j]=sc.nextInt();
}
}
System.out.println("Upper Triangle : ");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
if(i>=j)
System.out.print("\t"+Arr[i][j]);
else
System.out.print("\t");
}
System.out.println();
}
System.out.println("Lower Triangle : ");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
if(i<=j)
System.out.print("\t"+Arr[i][j]);
else
System.out.print("\t");
}
System.out.println();
}

System.out.println("Boundary : ");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
if(i==0 || i==N-1 || j==0 || j==N-1)
System.out.print("\t"+Arr[i][j]);
else
System.out.print("\t");
}
System.out.println();
}
System.out.println("Elements are : ");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print("\t"+Arr[i][j]);
}
System.out.println();
}
}
}