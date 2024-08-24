class A
{
    int age;
    public void show()
    {
        System.out.print("in show");
    }

    class B
    {
        public void config()
        {
            System.out.print("in config");
        }
    }
}
class innerClass
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();
    }
}