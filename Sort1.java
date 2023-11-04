import java.util.*;
public class Sort1
{
    Scanner sc=new Scanner(System.in);
    String str;
    int len;
    Sort1()
    {
        str="";
        len=0;
    }
    void readword()
    {
        System.out.println("Enter Word");
        str=sc.next();
    }
    void arrange()
    {
        char a[]=str.toCharArray();
        char temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            
                System.out.print(a[i]);
            
       }
       System.out.println();
    }
    void display()
    {
        System.out.println("Original Word= " +str);
    }
    public static void main(String args[])
    {
        Sort1 ob=new Sort1();
        ob.readword();
        ob.arrange();
        ob.display();
    }
}