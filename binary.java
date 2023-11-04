import java.util.*;
class binary
{
    public static void main(String[]args)
    {
        int[] a={2,3,4,6,7,8,9};
        int num=6;
        int L=0;
        int H=6;
        int M=(L+H)/2;
        while(L<=H)
        {
        if(a[M]==num)
        {
            System.out.println("Element is at index= "+M);
            break;
        }
        else if(a[M]<num)
        {
            L=M+1;
        }
        else if(a[M]>num)
        {
            H=M-1;
        }
        M=(L+H)/2;
        }
        if(L>H)
        System.out.println("Element not found");
    }
}