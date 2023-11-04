import java.util.*;
class Combine
{
    Scanner sc=new Scanner(System.in);
    int com[];
    int size;
    Combine(int nn)
    {
        size=nn;
        com=new int[size];
    }
    void inputarray()
    {
        System.out.println("Enter Elements in the Array= ");
        for(int i=0;i<size;i++)
        {
            com[i]=sc.nextInt();
        }
    }
    void sort()
    {
        int temp=0;
        for(int i=0;i<size;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(com[j]<com[min])
                {
                    min=j;
                }
            }
            temp=com[i];
            com[i]=com[min];
            com[min]=temp;
        }
    }
    void mix(Combine A,Combine B)
    {
        int x=0;
        int y=0;
        int z=0;
        while(x<A.size)
        {
            com[z++]=A.com[x++];
        }
        while(y<B.size)
        {
            com[z++]=B.com[y++];
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+" ");
        }
    }
    void main()
    {
        System.out.println("Size of First Array= ");
        int a=sc.nextInt();
        System.out.println("Size of Second Array= ");
        int b=sc.nextInt();
        Combine P=new Combine(a);
        Combine Q=new Combine(b);
        Combine R=new Combine(a+b);
        P.inputarray();
        Q.inputarray();
        R.mix(P,Q);
        R.sort();
        R.display();
    }
}
