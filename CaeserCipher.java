import java.util.*;
class CaeserCipher
{
    Scanner sc=new Scanner(System.in);
    String s;
    String s1="";
    void main()
    {
        System.out.println("Enter a String: ");
        s=sc.nextLine();
        int L=s.length();
        if(L<=3 || L>=100)
        {
            System.out.println("INVALID LENGTH");
            return;
        }
        for(int i=0;i<L;i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='M') || (ch>='a' && ch<='m'))
            {
                s1=s1+((char)(ch+13));
            }
            else if((ch>='N' && ch<='Z') || (ch>='n' && ch<='z'))
            {
                s1=s1+((char)(ch-13));
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println("The cypher text is: ");
        System.out.println(s1);
    }
}