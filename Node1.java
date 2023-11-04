import java.util.Scanner;
class Node1
{
    int data;
    Node1 next;
    Node1()
    {
        data=0;
        next=null;
    }
}
class list1
{
    Node1 start;
    list1()
    {
        start=null;
    }
    void insert(int x)
    {
        Node1 newNode=new Node1();
        newNode.data = x;
        if(start == null)
        {
            start = newNode;
        } else if(x>start.data)
        {
            boolean check = false;
            Node1 temp=start;
            while(temp != null)
            {
                Node1 nextNode = temp.next;
                if(nextNode == null)
                {
                    nextNode=new Node1();
                    nextNode.data = 2147483647;
                }
                if(temp.data < newNode.data && nextNode.data>newNode.data)
                {
                    newNode.next = nextNode;
                    temp.next = newNode;
                    check = true;
                    break;
                } else if(temp.next != null) 
                {
                    temp = temp.next;
                } else if(temp.next == null)
                {
                    break;
                }
            }
            if(check == false)
            {
                temp.next = newNode;
            }
        } 
        else if(x< start.data)
        {
            newNode.next = start;
            start = newNode;
        }
    }
    boolean search(int x)
    {
        boolean present= false;
        Node1 temp = start;
        while(temp != null)
        {
            if(temp.data == x)
            {
                present=true;
                break;
            }
            temp=temp.next;
        }
        return present;
    }
    void display()
    {
        Node1 temp = start;
        while (temp != null)
        {
            if(temp.data != 2147483647) 
            {
                System.out.print(temp.data + "\t");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}
class Test1
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        list1 ob=new list1();
        while(true){
            System.out.println("1.Enter element in ascending order \n 2.Search Element \n 3.Display List \n 4.Exit");
            int ch=sc.nextInt();
            if(ch == 1)
            {
                System.out.println("Enter Element to be inserted: ");
                ob.insert(sc.nextInt());
            } else if(ch ==2)
            {
                System.out.println("Enter element to be searched: ");
                if(ob.search(sc.nextInt()) == true)
                {
                    System.out.println("Element found.");
                } else 
                {
                    System.out.println("Element not found.");
                }
            } else if(ch ==3)
            {
                ob.display();
            } else if(ch == 4)
            {
                break;
            }
        }
    }
}

