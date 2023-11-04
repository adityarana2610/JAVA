import java.io.*;
class file4
{
    void PrintDryCity()
    {
        String city;
        double rf;
        System.out.println("Dry City with rainfall");
        try
        {
            FileReader obj1=new FileReader("Rainfall.txt");
            BufferedReader obj2=new BufferedReader(obj1);
            do
            {
                city=obj2.readLine();
                if(city.equals(null))
                break;
                rf=Double.parseDouble(obj2.readLine());
                if(rf<50)
                System.out.println(city+" "+rf);
                
            }while(!city.equals(null));
        }
        catch (Exception e)
        {}
    }
}