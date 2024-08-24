@FunctionalInterface
interface A
{
    void show();
}
class functionalLnterface
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}