import java.util.*;
class functionoverloading
{
    double volume(double r)
    {
        double v=4.0/3*22.0/7*r*r*r;
        return v;
    }
    double volume(double r1, double h)
    {
        return 22.0/7*r1*r1*h;
    }
    double volume(double l,double b,double h)
    {
        return l*b*h;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu \n /. Volume");
    }
}
