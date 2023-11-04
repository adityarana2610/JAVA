import java.util.*;
class Update extends Godown
{
    int pur_qty;
    int pur_rate;
    Update(int Q,int R)
    {
        pur_qty=Q;
        pur_rate=R;
    }
    void update()
    {
        qty=++Q;
        if(pur_rate!=rate)
        {
            rate=pur_rate;
        }
        amt=qty*rate;
    }
    void display()
    {
        super.display();
        System.out.println("Stock Details= "+amt);
    }
}