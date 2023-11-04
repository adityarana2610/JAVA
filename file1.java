import java.util.*;
import java.io.*;
class file1
{
    void check()
    {
        FileReader r=new FileReader("Sales.txt");
        BufferedReader in=new BufferedReader(r);
        String str="";
        while(str=in.readLine()!=NULL)
        {
            String std=str.substring(0,str.lastIndexOf(' '));
            int mks=Integer.parseInt(str.substring(str.lastIndexOf(' ')+1));
            if(mks>75)
            {
                System.out.println("Student's Name: "+std);
            }
        }
        in.close();
        r.close();
    }
}