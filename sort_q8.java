import java.io.*;
class sort_q8
{
    int ar[]={79,58,42,94,66};
    int n=5;
    boolean LinearSearch(int val)
    {
        boolean found=false;
        for(int i=0;i<=n-1;i++)
        {
            if(ar[i]==val)
            {
                found=true;
                break;
            }
        }
        if(found==true)
        System.out.print("Element "+val+" is Present");
        else
        System.out.print("ELement "+val+" is Absent");
        return found;
    }
}