import java.util.*;
class student
{
    Scanner sc=new Scanner(System.in);
    String name;
    String sex;
    int age;
    void mydetails1()
    {
       System.out.println("Name of the Student= ");
       name=sc.next();
       System.out.println("Sex of the Student= ");
       sex=sc.next();
       System.out.println("Age of the Student= ");
       age=sc.nextInt();
    }
    void show1()
    {
        System.out.println("Name of Student= "+name);
        System.out.println("Sex of Student= "+sex);
        System.out.println("Age of Student= "+age);
    }
}
class marks extends student
{
    Scanner sc=new Scanner(System.in);
    int regnum;
    int marks;
    String subject;
    void mydetails2()
    {
       System.out.println("Enter Register Number= ");
       regnum=sc.nextInt();
       System.out.println("Marks of the Student= ");
       marks=sc.nextInt();
       System.out.println("Subject of the Student= ");
       subject=sc.next();
    }
    void show2()
    {
        System.out.println("Register Number= "+regnum);
        System.out.println("Marks of the Student= "+marks);
        System.out.println("Subject of the Student= "+subject);
    }
}