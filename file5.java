import java.io.*;
class file5
{
    public void findpro(int p) throws IOException
    {
        boolean found=false;
        boolean flag=false;
        FileInputStream fis=new FileInputStream("ABC.dat");
        DataInputStream fin=new DataInputStream(fis);
        while(!flag)
        {
            try
            {
                int pc=fin.readInt();
                double price=fin.readDouble();
                int q=fin.readInt();
                if(q==pc)
                {
                    found=true;
                    break;
                }
            }
            catch(EOFException e)
            {
                System.out.println("Reached End of File");
                flag=true;
            }
        }
        if(found)
        {
            System.out.println(p+ "is available");
        }
        else
        {
            System.out.println(p+ "is not available");
        }
        fin.close();
        fis.close();
    }
}