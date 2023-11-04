import java.util.*;
class Recur1 
{
    void perform(int n)
    {
        int s=0,g;
        while(n>0)
        {
            if(n%2==1)
            {
                g=n%10;
                System.out.print("\n g=\t"+g);
                s=s+g;
            }
            n=n/10;
        }
        System.out.print("\n s== =\t"+s);
    }
}