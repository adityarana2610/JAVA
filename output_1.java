class output_1
{
    void witty(String n,int p)
    {
        if(p<0)
        {
            System.out.println("");
        }
        else
        {
            System.out.println(n.charAt(p)+".");
            witty(n,p-1);
            System.out.println(n.charAt(p));
        }
    }
}