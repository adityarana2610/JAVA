import java.util.*;
import java.io.*;
class file3
{
    Scanner sc=new Scanner(System.in);
    public void FillDataInFile()
    {
        String name="";
        int amt=0;
        try
        {
            FileWriter obj1=new FileWriter("Sales.txt");
            BufferedWriter obj2=new BufferedWriter(obj1);
            PrintWriter obj3=new PrintWriter(obj2);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+".Enter the Name of Salesman: ");
                name=br.readLine();
                System.out.print("Enter the Amount Booked");
                amt=sc.nextInt();
                obj3.println(name);
                obj3.println(amt);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error in Input");
        }
    }
}