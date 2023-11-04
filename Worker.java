import java.util.*;
class Worker
{
    Scanner sc=new Scanner(System.in);
    String Name;
    double Basic;
    Worker(String nm,double bas)
    {
        Name=nm;
        Basic=bas;
    }
    void display()
    {
        System.out.println("NAME= "+Name);
        System.out.println("BASIC= "+Basic);
    }
}