interface A{
    int age=4;
    String area = "pune"; //all the variables inside interface is static and final
    void show(); //all the methods in interface by default public abstract
    void config();
}
interface X{
    void run();
}

interface Y extends X
{

}
class B implements A,X //we use implements insstead of abstract but if we cannot call all the method of interface then it become abstract 
// so wwe cannot create object of this for that reason se call all method in B class
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("in run");  //we can create multiple interfaces with same class but we cannot create multiple abstract class with single normal class
    }
}
class interfaces{
    public static void main(String[] args){
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area); //we call by interface name as it is static                     
    }
}