import java.util.*;
class Sort01
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N=sc.nextInt();
        String []Names=new String[N];
        System.out.println("Enter " +N+ " Names");
        for(int i=0;i<Names.length;i++)
        {
            Names[i]=sc.next();
        }
        String temp="";
        for(int i=0;i<Names.length-1;i++)
        {
            for(int j=0;j<Names.length-1-i;j++)
            {
                if(Names[j].compareTo(Names[j+1])>0)
                {
                    temp=Names[j];
                    Names[j]=Names[j+1];
                    Names[j+1]=temp;
                }
            }
        }
        for(int i=0;i<Names.length;i++)
        {
            System.out.println(Names[i]);
        }
    }
}