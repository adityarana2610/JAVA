import java.util.*;
class Calvol extends Base implements Data
{
    Scanner sc=new Scanner(System.in);
    double ht;
    Calvol(double r,double h)
    {
        super(r);
        ht=h;
    }
    double volume()
    {
        return (pi*rad*rad*ht);
    }
    void show()
    {
        super.show();
        System.out.println("HEIGHT: "+ht);
        System.out.println("VOLUME: "+volume());
    }
}