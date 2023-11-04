import java.util.*;
class cyberworld
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence= ");
        String s=sc.nextLine();
        s=" "+s+" ";
        char ch;
        char ch1;
        for(int i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==' ')
            {
                System.out.print(" "+Character.toUpperCase(ch1));
                i++;
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}