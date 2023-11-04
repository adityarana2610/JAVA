import java.util.*;
class Menu1
{
    Scanner sc=new Scanner(System.in);
    int x;
    
    void main()
    {
        
        
    
        switch(ch)
        {
            case 1:
            {
            int fact()
            {
                int f=1;
                for(int i=1;i<=x;i++)
                {
                    f=f*i;
                    
                }
                return f;
            }
            }
            case 2:
                {
            int Armstrong()
            {
                int n=x;
                int sum=0;
                while(n!=0)
                {
                    int digit=n%10;
                    sum=sum+digit*digit*digit;
                    n=n/10;
                    
                }
                if(x==sum)
                return 1;
                else 
                return 0;
            }
        }
        
    }
}
}