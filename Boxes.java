import java.util.*;
class Boxes
{
    Scanner sc=new Scanner(System.in);
    int N;
    void main()
    {
        System.out.println("Enter number of boxes= ");
        N=sc.nextInt();
        if(N<1 || N>1000)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int carton[]={48,24,12,6};
        int total=0;int t=N;
        int len=carton.length;
        for(int i=0;i<len;i++)
        {
            int count=t/carton[i];
            t=t%carton[i];
            total=total+count;
            System.out.println(carton[i]+" * "+count+" = "+(carton[i]*count));
        }
        if(t!=0)
        {
            System.out.println("Remaining boxes  "+t+"*1 = "+t);
            total++;
        }
        else
        {
            System.out.println("Remaining boxes = 0");
        }
        System.out.println("Total number of boxes = "+N);
        System.out.println("Total number of cartons= "+total);
    }
}