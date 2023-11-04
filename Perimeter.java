import java.util.*;
class Perimeter
{
    Scanner sc=new Scanner(System.in);
    double a;
    double b;
    Perimeter(double l,double br)
    {
        a=l;
        b=br;
    }
    double Calculate()
    {
        return 2*(a+b);
    }
    void show()
    {
        System.out.println("Length= "+a);
        System.out.println("Breadth= "+b);
        System.out.println("Perimeter= "+Calculate());
    }
}
class Area extends Perimeter
{
    Scanner sc=new Scanner(System.in);
    double h;
    double area;
    Area(double l,double br,double ht)
    {
        super(l,br);
        h=ht;
    }
    void doarea()
    {
        area=super.b*h;
    }
    void show()
    {
        super.show();
        System.out.println("Height= "+h);
        System.out.println("Area= "+area);
    }
}