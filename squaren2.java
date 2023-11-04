import java.util.*;
class squaren2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i*i;
        }
        System.out.print("sum of series= "+sum);
    }
}