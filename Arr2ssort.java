import java.util.*;
class Arr2ssort
{
public static void main()
{
int Arr[][];
int R,C;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of rows : ");
R=sc.nextInt();
System.out.print("Enter Number of Columns : ");
C=sc.nextInt();
Arr=new int[R][C];
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
Arr[i][j]=sc.nextInt();
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
int temp[]=new int[len];
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
    int min=temp[i];
    int pos=i;
    for(int j=i+1;j<len;j++)
    {
            if(temp[j]<min)
            {
               min=temp[j];
               pos=j;
            }
        
    }
    int t=min;
    temp[pos]=temp[i];
    temp[i]=t;
    
 }
ctr=0;
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        Arr[i][j]=temp[ctr++];
    }
}
System.out.println("After the Sorting");
System.out.println("Elements are :");
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        System.out.print("\t"+ Arr[i][j]);
    }
    System.out.println();
}
}
}