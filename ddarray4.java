import java.util.*;
class ddarray4
{
    public static void main()
    {
        int Arr[][]=new int[5][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                Arr[i][j]=sc.nextInt();
                
            }
        }
        int min=Arr[0][0];
        int max=Arr[0][0];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(min>Arr[i][j])
                {
                    min=Arr[i][j];
                }
                if(max<Arr[i][j])
                {
                    max=Arr[i][j];
                }
            }
        }
        System.out.println("Array is= ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Smallest number in array= "+min);
        System.out.println("Largest number in array= "+max);
        
    }
}