import java.util.*;
public class ArraySearch
{
    Scanner sc=new Scanner(System.in);
    int N;
    int NUM[]=new int[N];
    int ele;
    /*ArraySearch()
    {
        for(int i=0;i<N;i++)
        {
            NUM[i]=0;
        }
        ele=0;
    }*/
    void accept()
    {
        System.out.println("Enter Value");
        N=sc.nextInt();
        System.out.println("Enter "+N+" values in array");
        for(int i=0;i<10;i++)
        {
            NUM[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        ele=sc.nextInt();
    }
    void arrSort()
    {
        int temp=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(NUM[i]>NUM[i+1])
                {
                    temp=NUM[i];
                    NUM[i]=NUM[i+1];
                    NUM[i+1]=temp;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<N;i++)
        {
            System.out.print(NUM[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        ArraySearch ob=new ArraySearch();
        ob.accept();
        ob.arrSort();
        ob.display();
    }
}