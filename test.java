import java.util.*;
class test
{
    Scanner sc=new Scanner(System.in);
    public static void main()
    {
        int n1=0;
        int n2=0;
        int n3=0;
        
        if((n1> n2) && (n1>n3))
        {
            System.out.println("HIGHEST NUMBER: "+n1);
        }
        else if((n2> n1) && (n2>n3))
        {
            System.out.println("HIGHEST NUMBER: "+n2);
        }
        if((n3> n2) && (n3>n1))
        {
            System.out.println("HIGHEST NUMBER: "+n3);
        }
        }
}
