import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        int a=0;
        int r;
        for(int i=0;i<n;i++)
        {
            r=n%10;
            a=a*10+r;
            n=n/10;
        }
        if(n==a)
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }
    }
}