import java.util.*;
class Revno
{
    Scanner sc=new Scanner(System.in);
    int num;
    int rev=0;
    Revno()
    {
        num=0;
    }
    void inputnum()
    {
        System.out.println("Enter a Number: ");
        num=sc.nextInt();
    }
    int reverse(int nn)
    {
        if(nn>0)
        {
            rev=rev*10+nn%10;
            return reverse(nn/10);
        }
        else
        {
             return rev;
        }
    }
    void display()
    {
        System.out.println("ORIGINAL NUMBER: "+num);
        System.out.println("REVERSED NUMBER: "+reverse(num));
    }
    void main()
    {
        Revno ob=new Revno();
        ob.inputnum();
        ob.display();
    }
}