interface computer
{
    void code();
}
class laptop implements computer
{
    public void code()
    {
        System.out.println("code.compile,run");
    }
}
class dekstop implements computer
{
    public void code()
    {
        System.out.println("code.compile,run:faster");
    }
}
class devloper
{
    public void devapp(computer lap)
    {
        lap.code();
    }
}
class interFace
{
    public static void main(String[] args)
    {
        computer lap = new laptop();
        computer desk = new dekstop();

        devloper dev = new devloper();//pass ov=bject that you give to devloper
        dev.devapp(lap);    
    }
}