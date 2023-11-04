import java.util.*;
class q3_2019
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        String w="";
        String revw="";
        System.out.println("Enter the String= ");
        str=sc.nextLine();
        int len=str.length();
        int l=0;
        if(str.charAt(len-1)=='.'|| str.charAt(len-1)=='!' || str.charAt(len-1)=='?')
        {
            System.out.println("VALID INPUT");
        }
        else
        {
            System.out.println("INVALID INPUT");
            return;
        }
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            /*w=st.nextToken();
            l=w.length();
            for(int i=0;i<l;i++)
            {
                char ch=w.charAt(i);
                revw=ch+revw;
            }
            System.out.println(revw);
            revw="";*/
        }
        
    }
}