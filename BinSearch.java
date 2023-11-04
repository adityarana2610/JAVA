import java.util.*;
class BinSearch
{
    Scanner sc=new Scanner(System.in);
    int arr[];
    int n;
    BinSearch(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void fillarray()
    {
        System.out.println("Enter Elements in Array= ");
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
    }

    void sort()
    {
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    int bin_search(int l,int u,int v)
    {
        int mid;
        if(l>v)
        {
            return -1;
        }
        mid=(l+u)/2;
        if(v>arr[mid])
        {
            return(bin_search(mid+1,u,v));
        }
        else if(v<arr[mid])
        {
            return(bin_search(l,mid-1,v));
        }
        else
        {
            return mid;
        }
    }
    public static void main()
    {
        BinSearch ob=new BinSearch(10);
        ob.fillarray();
        ob.sort();
        int r=ob.bin_search(0,9,6);
        if(r==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+r);
        }
    }
}
