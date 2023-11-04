import java.util.*;
class Decode
{
    Scanner sc=new Scanner(System.in);
    String str="";
    void main()
    {
        System.out.println("Enter a String= ");
        str=sc.nextLine();
        int len=str.length();
        char ch=str.charAt(len-1);
        if(ch!='.' && ch!='?' && ch!='!' && ch!=',')
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int a[]=new int[10];
        String w[]=new String[10];
        int p=0;
        int x=0;
        String word="";
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                word=str.substring(p,i);
                int l=word.length();
                int sum=0;
                for(int j=0;j<l;j++)
                {
                    char ch1=word.charAt(j);
                    if(ch1=='A')
                    sum=sum+1;
                    else if(ch1=='B')
                    sum=sum+2;
                    if(ch1=='C')
                    sum=sum+3;
                    else if(ch1=='D')
                    sum=sum+4;
                    if(ch1=='E')
                    sum=sum+5;
                    else if(ch1=='F')
                    sum=sum+6;
                    if(ch1=='G')
                    sum=sum+7;
                    else if(ch1=='H')
                    sum=sum+8;
                    if(ch1=='I')
                    sum=sum+9;
                    else if(ch1=='J')
                    sum=sum+10;
                    if(ch1=='K')
                    sum=sum+11;
                    else if(ch1=='L')
                    sum=sum+12;
                    if(ch1=='M')
                    sum=sum+13;
                    else if(ch1=='N')
                    sum=sum+14;
                    if(ch1=='O')
                    sum=sum+15;
                    else if(ch1=='P')
                    sum=sum+16;
                    if(ch1=='Q')
                    sum=sum+17;
                    else if(ch1=='R')
                    sum=sum+18;
                    if(ch1=='S')
                    sum=sum+19;
                    else if(ch1=='T')
                    sum=sum+20;
                    if(ch1=='U')
                    sum=sum+21;
                    else if(ch1=='V')
                    sum=sum+22;
                    if(ch1=='W')
                    sum=sum+23;
                    else if(ch1=='X')
                    sum=sum+24;
                    if(ch1=='Y')
                    sum=sum+25;
                    else if(ch1=='Z')
                    sum=sum+26;
                }
                System.out.println(word+"="+sum);
                a[x]=sum;
                w[x]=word;
                x=x+1;
                p=i+1;
            }
        }
        int m=a.length;
        int temp=0;
        String t="";
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    t=w[j];
                    a[j]=a[j+1];
                    w[j]=w[j+1];
                    a[j+1]=temp;
                    w[j+1]=t;
                }
            }
            System.out.print("OUTPUT: ");
            for(i=0;i<x;i++)
            System.out.print(w[i]+" ");
        }
    }
}