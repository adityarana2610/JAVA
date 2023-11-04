import java.util.*;
public class SpecialComposite
{
    Scanner sc=new Scanner(System.in);
    int no;
    SpecialComposite()
    {
        no=0;
    }
    public void accept()
    {
        System.out.println("Enter Value");
        no=sc.nextInt();
    }
    boolean check(int n)
    {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            cnt++;
        }
        if(cnt!=2)
        return true;
        else
        return false;
    }
    int sumDigit(int n)
    {
        int s=0;
        //int num=n;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
    void display()
    {
        if(check(no)==true && no%sumDigit(no)==0)
        System.out.println("Special Composite" +no);
        else
        System.out.println("Not a Special Composite" +no);
    }
    public void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        SpecialComposite ob=new SpecialComposite();
        ob.accept();
        ob.display();
    }
}