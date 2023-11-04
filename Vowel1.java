import java.util.*;
class Vowel1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        // String s="ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE .";
        // String s="LOOK BEFORE YOU LEAP .";
        String s="YOU MUST AIM TO BE A BETTER PERSON TOMORROW THAN YOU ARE TODAY .";
        // System.out.println("Enter a String: ");
        // s=sc.nextLine();
        int len=s.length();
        if(s.charAt(len-1)=='.' || s.charAt(len-1)=='?' ||s.charAt(len-1)=='!')
        {
            System.out.println("VALID INPUT");
        }
        else
        {
            System.out.println("INVALID INPUT");
            return;
        }
        StringTokenizer st=new StringTokenizer(s);
        char ch,ch1;
        String str="";
        String str1="";
        int count=0;
        while(st.hasMoreTokens())
        {
            String w=st.nextToken();
            System.out.println(w);
            ch=w.charAt(0);
            ch1=w.charAt(w.length()-1);
            if((ch!='A' && ch!='E' && ch!='I'&& ch!='O' && ch!='U')||(ch1!='A' && ch1!='E' && ch1!='I'&& ch1!='O' && ch1!='U'))
            {

                str=str+" "+w;
            }

            if((ch=='A' || ch=='E' || ch=='I'|| ch=='O'||ch=='U')&&(ch1=='A' || ch1=='E' || ch1=='I'|| ch1=='O'|| ch1=='U'))
            {
                str1=str1+" "+w;
                count=count+1;
            }
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL="+count);
        System.out.println(str1+str);
    }
}