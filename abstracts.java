
// import package
import tools.advCalc;
abstract class car 
{
    public abstract void drive();

    public void license()
    {

    }
}
class swift extends car{
    public void drive()
    {
        System.out.print("driving");
    }
}
class abstracts
{
    public static void main(String[] args)
    {
        advCalc ca = new advCalc();
        car obj = new car();
        obj.drive();
    }
}