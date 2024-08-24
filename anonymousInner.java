class A
{
    public void show()
    {
        System.out.print("in show");
    }
}
class anonymousInner
{
    public static void main(String[] args)
    {
        A obj = new A(){
        public void show()
        {
        System.out.print("in new show");
        }
        };
        obj.show();
   }
}