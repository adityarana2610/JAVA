import java.util.*;
class jamnaprac_1
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        String str="";
        System.out.println("Enter a Paragraph= ");
        str=sc.nextLine();
        int len=str.length();
        if(str.charAt(len-1)!='.' || str.charAt(len-1)!='?' || str.charAt(len-1)!='!')
        {
            System.out.println("INVALID INPUT");
            return;
        }
        StringTokenizer st=new StringTokenizer(str);
        char ch;
        String NSTR1="";
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            ch=st.nextToken().charAt(0);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
            {
                String word=st.nextToken();
                word.replace(ch,(char)(ch+1));
                NSTR1=NSTR1+word;
            }
        }
        System.out.print(NSTR1);
    }
}