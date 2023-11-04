import java.util.*;
class IndexA
{
    Scanner sc=new Scanner(System.in);
    int Arr[];
    IndexA()
    {
        Arr=new int[10];
        for(int i=0;i<=9;i++)
        Arr[i]=0;
    }
    void input()
    {
        System.out.println("Enter the Elements= ");
        for(int i=0;i<=9;i++)
        {
            Arr[i]=sc.nextInt();
        }
    }
    void sortarr()
    {
        int N=Arr.length;
        int i,j,pos,temp;
        for(i=0;i<N-1;i++)
        {
            pos=i;
            for(j=i+1;j<N;j++)
            {
                if(Arr[j]<Arr[pos])
                {
                    pos=j;
                }
            }
            temp=j;
        }
    }
}