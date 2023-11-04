import java.util.*;
class Wonder
{
    public static void main(String args[])
    {
        String W[]={"CHICHEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICHU","PETRA","COLOSSEUM"};
        String C[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Country to Search= ");
        String L=sc.next();
        int pos=0;
        boolean search=false;
        for(int i=0;i<C.length;i++)
        {
            if(L.equals(C[i]))
            {search=true;
            pos=i;
            }
            
        }
        if(search==true)
        System.out.println(C[pos] +":"+ W[pos]);
        if(search==false)
        System.out.println("Sorry Not Found!");
    }
}