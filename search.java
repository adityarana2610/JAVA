import java.util.*;
class Search
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
System.out.println("Elements are : ");
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
System.out.print("\t"+Arr[i][j]);
}
System.out.println();
}
System.out.print("Enter Name to Search= ");
String name=sc.next();
boolean flag=false;
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        if(Arr[i][j].equalsIgnoreCase(name)==true)
        flag=true;
    }
}
if(flag==true)
System.out.print("Name Exists");
else 
System.out.print("Name does not Exist");
}
}