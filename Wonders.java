import java.util.*;
class Wonders
{
    public static void main(String args[])
    {
        String w[]={"CHICHEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICHU","PETRA","COLOSSEUM"};
        String c[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        String L="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Country= ");
        L=sc.next();
        int pos=0;
        boolean search=false;
        for(int i=0;i<c.length;i++)
        {
            if(L.equals(c[i]))
            {
                search=true;
                pos=i;
            }
        }
        if(search==true)
        System.out.println(c[pos]+"="+w[pos]);
        if(search==false)
        System.out.println("Not Found");
    }
}