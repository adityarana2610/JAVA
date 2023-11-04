import java.util.*;
class Graduation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        System.out.print("Enter year of Graduation= ");
        int year=sc.nextInt();
        int L=0;
        int U=10;
        int M=0;
        int flag=0;
        for(int i=0;i<=10;i++)
        {
            while(L<=U)
            {
                M=(L+U)/2;
                { 
                    if(y[M]==year)
                    {
                        flag=M;
                        break;
                    }
                    else if(y[M]<year)
                    {
                        L=M+1;
                    }
                    else
                    {
                        U=M-1;
                    }
                }
                if(flag==-1)
                System.out.println("Record does not exist");
                else
                System.out.println("Record exists");
            }
        }
    }
}