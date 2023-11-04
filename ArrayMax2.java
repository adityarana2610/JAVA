import java.util.*;
class ArrayMax2
{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    int flag=1;
    int LD=0;
    int RD=0;
    static int m;
    ArrayMax2(int mm)
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
        System.out.println("Enter the Numbers= ");
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
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                LD=LD+arr[i][j];
                if((i+j)==(m-1))
                RD=RD+arr[i][j];
            }
        }
        System.out.println("Sum of LD= "+LD);
        System.out.println("Sum of RD= "+RD);
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
        ArrayMax2 ob=new ArrayMax2(m);
        ob.readarray();
        ob.large();
        ob.display();
    }
  }

    
    
        
    
