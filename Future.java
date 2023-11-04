import java.util.*;
public class Future
{
    Scanner sc=new Scanner(System.in);
    int yy,mm,dd;
    int period;
    Future()
    {
         yy=0;
         mm=0;
         dd=0;
         period=0;
    }
    void read()
    {
        System.out.println("Enter the Current Date= ");
        yy=sc.nextInt();
        mm=sc.nextInt();
        dd=sc.nextInt();
    }
    boolean valid()
    {
        
    }
    void futureDate()
    {
        
    }
    void main()
    {
        Future ob=new Future();
        ob.read();
        ob.valid();
        ob.futureDate();
    }
}
    
        