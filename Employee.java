import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int empNo;String empName;
    String empDesig;
    Employee()
    {
        empNo=0;
        empName="";
        empDesig="";
    }
    Employee(int n,String name,String d)
    {
        empNo=n;
        empName=name;
        empDesig=d;
    }
    void display()
    {
        System.out.println("Employee Number: "+empNo);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Designation: "+empDesig);
    }
}
