import java.io.*;
 class FileIOExample2
 {
     public static void main(String args[])throws IOException
     {
         FileReader file=new FileReader("names.txt");
         BufferedReader fileInput=new BufferedReader(file);
         String text; //Read file and output
         int i=0;
         while((text=fileInput.readLine())!=null)
         {
             i++;
             System.out.print("Name"+i+":");
             System.out.println(text);
         }
         fileInput.close(); //close file
     }
 }