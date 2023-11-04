import java.util.*;
class Performance
{
    Scanner sc=new Scanner(System.in);
    int Marks[];
    int Mode;
    int FreqOfMode;
    Performance()
    {
        Marks=new int[10];
        Mode=0;
        FreqOfMode=0;
    }

    void readMarks()
    {
        System.out.println("Enter Marks of 10 students= ");
        for(int i=0;i<10;i++)
        {
            Marks[i]=sc.nextInt();
        }
    }

    int getMode()
    {

        for(int i=0;i<10;i++)
        {
            if(Mode<Marks[i])
            {
                Mode=Marks[i];
            }
        }
        return Mode;
    }

    void calcFreqAndMode()
    {
        int md=getMode();
        for(int i=0;i<10;i++)
        {
            if(md==Marks[i])
                FreqOfMode++;
        }
        System.out.println("Mode= "+Mode);
        System.out.println("Frequency of Mode= "+FreqOfMode);
    }

    void main()
    {
        Performance ob=new Performance();
        ob.readMarks();
        ob.getMode();
        ob.calcFreqAndMode();
    }

}