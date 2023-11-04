import java.util.*;
class PrimePalindrome
{
    Scanner sc=new Scanner(System.in);
    int m;
    int n;
    void main()
    {
        System.out.println("Enter the Value of M= ");
        m=sc.nextInt();
        System.out.println("Enter the Value of N= ");
        n=sc.nextInt();
        if(m<100 || n>3000)
        {
            System.out.println("Invalid Input");
            return;
        }
        int sum;
        int freq=0;
        for(int i=m;i<=n;i++)
        {
            sum=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+1;
                }
            }
            if(sum==2)
            {
                int x=i;
                int rev=0;
                while(x!=0)
                {
                    int d=x%10;
                    rev=rev*10+d;
                    x=x/10;
                }
                if(rev==i)
                System.out.print(i+",");
                freq=freq+1;
            }
        }
        System.out.println("\n Frequency of prime palindrome integers: "+freq);
    }
}