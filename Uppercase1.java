import java.util.*;
class Uppercase1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter a Sentence= ");
        s=sc.nextLine();
        String str=s.toUpperCase();
        int length=str.length();
        int count=0;
        for(int i=0;i<length-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                System.out.print(str.charAt(i));
                System.out.println(str.charAt(i+1));
                count++;
            }
            
        }
        System.out.println("Output= "+count);
    }
}  