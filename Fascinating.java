import java.util.*;
class Fascinating
{
    Scanner sc=new Scanner(System.in);
    int n;
    void main()
    {
        System.out.println("Enter the Number= ");
        n=sc.nextInt();
        if(n<100)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int n2=n*2;
        int n3=n*3;
        String s=Integer.toString(n);
        String s2=Integer.toString(n2);
        String s3=Integer.toString(n3);
        String str=s+s2+s3;
        System.out.println("Concatenating the results: "+str);
        boolean flag=true;
        for(char ch='1';ch<='9';ch++)
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                count=count+1;
            }
            if(count>1 || count==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Fascinating");
        }
        else
        {
            System.out.println("Not Fascinating");
        }
    }
}
