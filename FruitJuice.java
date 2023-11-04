import java.util.*;
class FruitJuice
{
    Scanner sc=new Scanner(System.in);
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    FruitJuice()
    {
        product_code=0;
        flavour="";
        pack_type="";
        pack_size=0;
        product_price=0;
    }
    void input()
    {
        System.out.println("Enter product code number");
        product_code=sc.nextInt();
        System.out.println("Enter Flavour");
        flavour=sc.next();
        System.out.println("Enter pack type");
        pack_type=sc.next();
        System.out.println("Enter pack size");
        pack_size=sc.nextInt();
        System.out.println("Enter product_price");
        product_price=sc.nextInt();
    }
    void discount()
    {
        product_price=product_price-10;
    }
    void display()
    {
        System.out.println("Product Code= "+product_code);
        System.out.println("Flavour= "+flavour);
        System.out.println("Pack Type= "+pack_type);
        System.out.println("Pack Size= "+pack_size);
        System.out.println("Product Price= "+product_price);
    }
}