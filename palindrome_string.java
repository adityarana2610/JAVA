class palindrome_string
{
    public static void main(String s)
    {
        int l=s.length();
        int i,j=l-1;
        int x=0;
        for(i=0;i<l;i++)
        {
           if(s.charAt(i)!=s.charAt(j))
           {
               x=1;
           }
           j--;
        }
        if(x==0)
           {
            System.out.println("Palindrome");
           }
           else
           {
               System.out.println("not");
           }
    }
}