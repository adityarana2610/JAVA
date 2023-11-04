import java.util.*;
public class Sort2
{
    Scanner sc=new Scanner(System.in);
    String str;
    int len;
    Sort2()
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
            len=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[len])
                {
                    len=j;
                }
            }
            temp=a[i];
            a[i]=a[len];
            a[len]=temp;
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