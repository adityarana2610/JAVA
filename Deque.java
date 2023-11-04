import java.util.*;
class Deque
{
    Scanner sc=new Scanner(System.in);
    int N[];
    int fctr;
    int rctr;
    Deque(int A)
    {
        N=new int[A];
        fctr=5;
        rctr=5;
    }
    void pushfront(int k)
    {
        fctr--;
        N[fctr]=k;
    }
    void pushrear(int k)
    {
        rctr++;
        N[rctr]=k;
    }
    int popfront()
    {
        int t=N[fctr];
        fctr++;
        return(t);
    }
    int poprear()
    {
        int t=N[rctr];
        rctr--;
        return(t);
    }
    void main()
    {
        Deque ob=new Deque(5);
        ob.pushfront(22);
        ob.pushrear(11);
        int x=popfront();
        int y=poprear();
    }
}