import java.util.*;
class ArrayMax1
{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    static int m;
    ArrayMax1(int mm)
    {
        m=mm;
        arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=0;
            }
        }
    }
    void readarray()
    {
        System.out.println("Enter the Elements= ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void large()
    {
        int large=0;
        int i=0;
        int j=0;
        while(i<m)
        {
            for(j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>large)
                {
                    large=arr[i][j];
                }
            }
            System.out.println("Largest Value= "+large);
            large=0;
            i++;
        }
    }
    void display()
    {
        System.out.println("Value of Array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("\t" +arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        ArrayMax1 ob=new ArrayMax1(m);
        ob.readarray();
        ob.large();
        ob.display();
    }
}