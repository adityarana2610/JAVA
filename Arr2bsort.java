import java.util.*;
class Arr2bsort
{
public static void main()
{
String Arr[][];
int R,C;

Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of rows : ");
R=sc.nextInt();
System.out.print("Enter Number of Columns : ");
C=sc.nextInt();
Arr=new String[R][C];
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
Arr[i][j]=sc.next();
}
}
System.out.println("Before sorting");
System.out.println("Elements are : ");
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
System.out.print("\t"+Arr[i][j]);
}
System.out.println();
}
int len=R*C;
String temp[]=new String[len];
int ctr=0;
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        temp[ctr++]=Arr[i][j];
    }
}
for(int i=0;i<len-1;i++)
{
    for(int j=0;j<len-i-1;j++)
    {
        if(Arr[j].compareTo(Arr[j+1]>0))
        {
            
        }
    }
}
}
}