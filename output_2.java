import java.util.*;
class output_2
{
    void bubblesort(int arr[])
    {
        int i,j,k,tmp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    
                }
            }
        }
    }
}