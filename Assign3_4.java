import java.util.*;
class Assign3_4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter first number");
        int a=sc.nextInt();
        System.out.println("Please Enter second number");
        int b=sc.nextInt();
        System.out.println("Please Enter third number");
        int c=sc.nextInt();
        System.out.println("The Numbers in Ascending Order are : ");
        if(a<b)
         if(a<c)
          if(b<c)
            System.out.println(a +"," + b +"," + c);
          else
            System.out.println(a +"," + c +"," + b);
         else
           System.out.println(c +"," + a +"," + b);
        else
         if(b<c)
          if(a<c)
            System.out.println(b +"," + a +"," + c);
          else
            System.out.println(b +"," + c +"," + a);
         else
           System.out.println(c +"," + b +"," + a);
        }
 }