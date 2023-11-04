import java.util.*;
class IndependenceDay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="January 26 is celebrated as the Republic Day of India";
        s=s+' ';
        int p=0;
        String word="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                word=s.substring(p,i);
                if(word.equals("January"))
                {
                    System.out.print("August ");
                }
                else if(word.equals("26"))
                {
                    System.out.print("15 ");
                }
                else if(word.equals("Republic"))
                {
                    System.out.print("Independence ");
                }
              else 
              {
              
              System.out.print(word+" ");
            }
             
              p=i+1;
            }
            
            
            }
        
        
        
    
}
}