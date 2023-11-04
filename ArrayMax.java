import java.util.*;
class ArrayMax
{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    static int m;
    ArrayMax(int mm)
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
        System.out.println("Enter elements in the Array= ");
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
        int max=0;
        int i=0;
        int j=0;
        while(i<m)
        {
            for(j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
                
            }
            arr[i][j]=max;
            max=0;
            i++;
        }
    }
    void display()
    {
        int i,j;
        System.out.println("The maximum value of array");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print("\t" +arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        ArrayMax ob=new ArrayMax(m);
        ob.readarray();
        ob.large();
        ob.display();
    }
}