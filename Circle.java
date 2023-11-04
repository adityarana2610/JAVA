class Circle extends Plane
{
    double x2,y2;
    double radius,area;
    Circle(double nx,double ny,double r,double a)
    {
        super(nx,ny);
        x2=r;
        y2=a;
    }
    void findRadius()
    {
        radius=(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))/2;
    }
    void findArea()
    {
        area=3.14*radius*radius;
    }
    void show()
    {
        super.show();
        System.out.println("X-Coordinate= "+x2);
        System.out.println("Y-Coordinate= "+y2);
        System.out.println("Length of Radius= "+radius);
        System.out.println("Area "+area);
    }
}