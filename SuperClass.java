class SuperClass
{
    String id="id of Superclass";
    void identify()
    {
        System.out.println("This is identify() of SuperClass");
    }
}
class SubClass extends SuperClass
{
    String id="id of SubClass";
    void identify()
    {
        System.out.println("This is identify() of SubClass");
    }
    void test()
    {
        System.out.println(id);
        identify();
        System.out.println(super.id);
        super.identify();
    }
}