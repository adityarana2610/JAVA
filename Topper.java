import java.util.*;
class Topper
{
    public static void main(String args[])
    {
        String N[]=new String[5];
        int P[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the name" +(i+1) +":");
            N[i]=sc.next();
            System.out.print("Enter the Percentage: ");
            P[i]=sc.nextInt();
        }
        
        int temp=0;
        String temp2="";
        int L=P.length;
        for(int i=0;i<L-1;i++)
        {
            int pos=i;
            for(int j=i+1;j<L;j++)
            {
                if(P[j]>P[pos])
                {
                    pos=j;
                }
            }
            temp=P[pos];
            P[pos]=P[i];
            P[i]=temp;
            
            temp2=N[pos];
            N[pos]=N[i];
            N[i]=temp2;
        }
        System.out.println("Toppers of class are: ");
        for(int i=0;i<3;i++)
        {
            System.out.println(N[i] +"\t"+ P[i]);
        }
    }
}