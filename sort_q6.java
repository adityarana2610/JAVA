import java.io.*;
class sort_q6
{
    int ar[]={95,50,20,40,60};
    int n=5;
    void bubble()
    {
        int s,j,temp,r;
        for(s=1;s<=4;s++)
        {
            for(j=0;j<=(n-1)-s;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Elements in Bubble sort are=");
        for(r=0;r<=4;r++)
        {
            System.out.print(ar[r]+" ");
        }
    }
}