import java.util.*;
class Uppercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S;
        System.out.println("Enter a Sentence= ");
        S=sc.nextLine();
        int count=0;
        char ch;
        char ch1;
        int l;
        S=S+" ";
        l=S.length();
        S=S.toUpperCase();
        for(int i=0;i<l-1;i++)
        {
            ch=S.charAt(i);
            ch1=S.charAt(i+1);
            if((ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch=='U')&& (ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U'))
            {
                System.out.print(ch+""+ch1+",");
                count++;
            }
            }
        System.out.println("Number of Pairs of vowels are= "+count);
    }
}