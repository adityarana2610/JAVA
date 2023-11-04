import java.util.*;
class Shift
{
    Scanner sc=new Scanner(System.in);
    int mat[][];
    int m;
    int n;
    Shift(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }

    void input()
    {
        System.out.println("Enter the Elements= ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }

    void cyclic(Shift P)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)
                {
                    mat[m-1][j]=P.mat[0][j];
                }
                else
                {
                    mat[i-1][j]=P.mat[i][j];
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Shift x=new Shift(3,4);
        Shift y=new Shift(3,4);
        x.input();
        y.cyclic(x);
        System.out.println("ORIGINAL MATRIX= ");
        x.display();
        System.out.println("SHIFTED MATRIX= ");
        y.display();
    }
}