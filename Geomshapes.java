import java.util.Scanner;
class Dimensions
{
    int no_of_sides;
    double sides[];
    double area;
    void calcArea()
    {
        area=0;
    }
    Dimensions(int num)
    {
        no_of_sides=num;
        sides=new double[num];
    }
    void readSides()
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<no_of_sides;i++)
        {
            System.out.println("Enter Side"+(i+1)+" : ");
            sides[i]=in.nextDouble();
        }
    }
}
class Square extends Dimensions
{
    Square()
    {
        super(1);
        System.out.println("---SQUARE---");
        readSides();
    }
    void calcArea()
    {
        area=sides[0]*sides[0];
    }
    void display()
    {
        System.out.println("SQUARE STATISTICS");
        System.out.println("Sides"+sides[0]);
        calcArea();
        System.out.print("Area : "+area);
    }
}
class Rectangle extends Dimensions
{
    Rectangle()
    {
        super(2);
        System.out.println("---RECTANGLE---");
        readSides();
    }
    void calcArea()
    {
        area=sides[0]*sides[1];
    }
    void display()
    {
        System.out.println("RECTANGLE STATISTICS");
        System.out.println("Length"+sides[0]);
        System.out.println("Breadth"+sides[1]);
        calcArea();
        System.out.print("Area : "+area);
    }
}
class Triangle extends Dimensions
{
    Triangle()
    {
        super(3);
        System.out.println("---TRIANGLE---");
        readSides();
    }
    void calcArea()
    {
        double s=(sides[0]+sides[1]+sides[2])/2;
        area=Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
    }
    void display()
    {
        System.out.println("TRIANGLE STATISTICS");
        System.out.println("Side 1"+sides[0]);
        System.out.println("Side 2"+sides[1]);
        System.out.println("Side 3"+sides[2]);
        calcArea();
        System.out.print("Area : "+area);
    }
}
public class Geomshapes
{
    public static void main(String args[])
    {
        Square sqr=new Square();
        Rectangle rect=new Rectangle();
        Triangle trg=new Triangle();
        sqr.display();
        rect.display();
        trg.display();
    }
}