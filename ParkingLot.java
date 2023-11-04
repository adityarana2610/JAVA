import java.util.*;
class ParkingLot
{
    Scanner sc=new Scanner(System.in);
    int vno;
    int hours;
    double bill;
    void input()
    {
        System.out.println("Enter the vehicle number");
        vno=sc.nextInt();
        System.out.println("Number of Hours");
        hours=sc.nextInt();
        
    }
    void calculate()
    {
        if(hours<=1)
        bill=3;
        else
        bill=3+(hours-1)*1.5;
    }
    void display()
    {
        System.out.println("Vehicle Number= "+vno);
        System.out.println("Number of Hours= "+hours);
        System.out.println("Bill Amount= "+bill);
        
    }
    public static void main()
    {
        ParkingLot ob=new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}