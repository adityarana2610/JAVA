import java.util.*;
class ddarray_string
{
    public static void main()
    {
        String Arr[][];
        int R;
        int C;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows= ");
        R=sc.nextInt();
        System.out.print("Enter Number of columns= ");
        C=sc.nextInt();
        Arr=new String[R][C];
        System.out.println("Enter Names in the Array= ");
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                Arr[i][j]=sc.next();
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter Name to be Searched=");
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
        System.out.println("Name Exists");
        else 
        System.out.println("Name does not Exist");
    }
}