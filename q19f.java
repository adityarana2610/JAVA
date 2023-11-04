class q19f
{
    public static void main()
    {    
        int a=1;
        for(int i='@';i<=5;i++)
        {
            for(int j='#';j<=i;j++)
            {
                System.out.print(a++ +"\t "); 
            }
            System.out.println();
        }
    }
}