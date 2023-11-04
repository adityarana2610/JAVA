import java.util.*;
class jamnaprac_2
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter Value of M= ");
        int M=sc.nextInt();
        System.out.println("Enter Value of N= ");
        int N=sc.nextInt();
        if((M<=2 || M>=10)||(N<=2 || N>=10))
        {
            System.out.println("WRONG INPUT");
            return;
        }
        int NUM[][]=new int[M][N];
        System.out.println("Enter Elements in Array= ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                NUM[i][j]=sc.nextInt();
            }
        }
        int rev[][]=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                int x=NUM[i][j];
                int r=0;
                while(x!=0)
                {
                    int digit=x%10;
                    r=r*10+digit;
                    x=x/10;
                }
                rev[i][j]=r;
            }
        }
        System.out.println("Array after reversing the digits: ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(rev[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array after swiping the rows and columns: ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(NUM[j][i]+" ");
            }
            System.out.println();
        }
    }
}