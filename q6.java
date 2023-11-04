import java.util.*;
class q6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int term=1;
        for(int i=0;i<=n;i++)
        {
            System.out.print(term+",");
            term=term*10;
            
        }
    }
}
