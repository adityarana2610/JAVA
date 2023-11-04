import java.util.*;
public class Word1
{
    Scanner sc=new Scanner(System.in);
    int N;
    void read()
    {
        System.out.println("Enter the Value of N= ");
        N=sc.nextInt();
    }
    void convert()
    {
        int a,x,y,z,i=0;
        do{
            x=N%10;
            N=N/10;
            y=N%10;
            N=N/10;
            z=N%10;
            N=N/10;
          }
        while(N!=0);
        switch(z)
        {
            case 1: System.out.print("ONE HUNDRED ");
            break;
            case 2: System.out.print("TWO HUNDRED ");
            break;
            case 3: System.out.print("THREE HUNDRED ");
            break;
            case 4: System.out.print("FOUR HUNDRED ");
            break;
            case 5: System.out.print("FIVE HUNDRED ");
            break;
            case 6: System.out.print("SIX HUNDRED ");
            break;
            case 7: System.out.print("SEVEN HUNDRED ");
            break;
            case 8: System.out.print("EIGHT HUNDRED");
            break;
            case 9: System.out.print("NINE HUNDRED");
            break;
        }
        if(y!=1)
        {
            switch(y)
            {
                 case 2: System.out.print("TWENTY ");
                 break;
                 case 3: System.out.print("THIRTY ");
                 break;
                 case 4: System.out.print("FORTY ");
                 break;
                 case 5: System.out.print("FIFTY ");
                 break;
                 case 6: System.out.print("SIXTY ");
                 break;
                 case 7: System.out.print("SEVENTY ");
                 break;
                 case 8: System.out.print("EIGHTY ");
                 break;
                 case 9: System.out.print("NINETY ");
                 break;
            }
        }
        if(y==1)
        {
            switch(x)
            {
                case 0: System.out.print("TEN ");
                break;
                case 1: System.out.print("ELEVEN ");
                break;
                case 2: System.out.print("TWELVE ");
                break;
                case 3: System.out.print("THIRTEEN ");
                break;
                case 4: System.out.print("FOURTEEN ");
                break;
                case 5: System.out.print("FIFTEEN ");
                break;
                case 6: System.out.print("SIXTEEN ");
                break;
                case 7: System.out.print("SEVENTEEN ");
                break;
                case 8: System.out.print("EIGHTEEN ");
                break;
                case 9: System.out.print("NINETEEN ");
                break;
            }
            System.exit(0);
        }
        switch(x)
        {
            case 1:System.out.print("ONE ");
            break;
            case 2:System.out.print("TWO ");
            break;
            case 3:System.out.print("THREE ");
            break;
            case 4:System.out.print("FOUR ");
            break;
            case 5:System.out.print("FIVE ");
            break;
            case 6:System.out.print("SIX ");
            break;
            case 7:System.out.print("SEVEN ");
            break;
            case 8:System.out.print("EIGHT ");
            break;
            case 9:System.out.print("NINE ");
            break;
        }
         
    }
    static void main()
    {
        Word1 ob=new Word1();
        ob.read();
        ob.convert();
    }
}