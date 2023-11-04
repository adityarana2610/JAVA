import java.util.*;
class Bank
{
    Scanner sc=new Scanner(System.in);
    String name;
    int acc_no;
    double principal;
    Bank(String N,int A,double P)
    {
        name=N;
        acc_no=A;
        principal=P;
    }
    void display()
    {
        System.out.println("Name of Customer= "+name);
        System.out.println("Account Number= "+acc_no);
        System.out.println("Principal Amount= "+principal);
    }
}