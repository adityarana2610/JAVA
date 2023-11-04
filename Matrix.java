import java.util.*;
class Matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int s=sc.nextInt();
        if(s<3 ||s>10)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int a[][]=new int[s][s];
        System.out.println("Enter Elements in Array: ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]<0)
                    return;
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int b[]=new int[(s-2)*(s-2)];
        int temp;
        int k=0;
        for(int i=1;i<s-1;i++)
        {
            for(int j=1;j<s-1;j++)
            {
                b[k++]=a[i][j];
            }
        }

        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        k=0;
        for(int i=1;i<s-1;i++)
        {
            for(int j=1;j<s-1;j++)
            {
                a[i][j]=b[k++];
            }
        }
        System.out.println("REARRANGED MATRIX");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("DIAGONAL ELEMENTS");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(i==j || i+j==s-1)
                {
                    sum=sum+a[i][j];
                    System.out.print(a[i][j]+" ");
                }
                else
                {
                    System.out.print("\t");
                }    
            }
            System.out.println();
        }
        System.out.println("SUM OF DIAGONAL ELEMENTS="+sum);

    }
}