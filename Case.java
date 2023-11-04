import java.util.*;
class Case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String s1=sc.nextLine();
        char ch;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(Character.toLowerCase(ch));
                
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.print(Character.toUpperCase(ch));
                
            
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}