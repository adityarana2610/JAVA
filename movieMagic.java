import java.util.*;
class movieMagic
{
    Scanner sc=new Scanner(System.in);
    int year;
    String title;
    float rating;
    movieMagic()
    {
        year=0;
        title="";
        rating=0.0f;
    }
    void accept()
    {
        System.out.println("Enter Year of Release");
        year=sc.nextInt();
        System.out.println("Enter Title of movie");
        title=sc.next();
        System.out.println("Enter Rating of the Movie");
        rating=sc.nextFloat();
    }
    void display()
    {
        System.out.println("Year of Release= "+year);
        System.out.println("Title of movie= "+title);
        if(rating>=0.0 && rating<=2.0)
        System.out.println("Flop");
        else if(rating>=2.1 && rating<=3.4)
        System.out.println("Semi-hit");
        else if(rating>=3.5 && rating<=4.5)
        System.out.println("Hit");
        else if(rating>=4.6 && rating<=5.0)
        System.out.println("Super Hit");
        
    }
    public static void main()
    {
        movieMagic ob=new movieMagic();
        ob.accept();
        ob.display();
    }
}