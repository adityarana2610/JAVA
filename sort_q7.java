import java.io.*;
class sort_q7
{
    int ar[]={85,25,10,70,60,35};
    int n=6;
    void InsertionSort()
    {
        for(int i=1;i<=n-1;i++)
        {
            int k=0;
            while(ar[k]<ar[i])
            {
                k++;
            }
            int temp=ar[i];
            for(int j=i-1;j>=k;j--)
            {
                ar[j+1]=ar[j];
            }
            ar[k]=temp;
        }
        System.out.println("The Element in Insertion Sort=");
        for(int r=0;r<=n-1;r++)
        {
            System.out.print(ar[r]+" ");
        }
    }
}