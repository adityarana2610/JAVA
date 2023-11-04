import java.util.*;
class Convert1
{
    Scanner sc=new Scanner(System.in);
    int n;
    int d;
    int m;
    int y;
    String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    Convert1()
    {
        n=0;
        d=0;
        m=0;
        y=0;
    }
    void accept()
    {
        System.out.println("Enter the Day number= ");
        n=sc.nextInt();
        System.out.println("Enter the Year= ");
        y=sc.nextInt();
    }
    void day_to_date()
    {
        
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if((y%100==0 && y%400==0)||y%4==0)
        {
            days[1]=29;
        }
        m=1;
        while(n>days[m])
        {
            n=n-days[m];
            m++;
        }
        d=n;
    }
    void display()
    {
        System.out.println("Date= "+month[m-1]+" "+d+","+" "+y);
    }
    void main()
    {
        Convert1 ob=new Convert1();
        ob.accept();
        ob.day_to_date();
        ob.display();
        
    }
}