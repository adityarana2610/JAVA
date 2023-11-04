import java.io.*;
class sort_q5
{
    int ar[]={85,50,20,40,60};
    void SelectionSort()
    {
        int bg=0,sm=0,psm=0,r=0,tmp=0;
        for(bg=0;bg<=3;bg++)
        {
            sm=ar[bg];
            psm=bg;
            for(r=bg+1;r<=4;r++)
            {
                if(sm>ar[r])
                {
                    sm=ar[r];
                    psm=r;
                }
            }
            tmp=ar[bg];
            ar[bg]=ar[psm];
            ar[psm]=tmp;
        }
        System.out.println("The elements in Ascending order after Selection sort= ");
        for(r=0;r<=4;r++)
        System.out.print(ar[r]+",");
    }
}