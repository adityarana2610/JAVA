class recur6
{
    void check(int n)
    {
        if(n<=0)
        return;
        System.out.println("..." +n%10);
        check(n/10);
    }
}