@FunctionalInterface
interface A
{
    void show(int i);
}
class lambda
{
    public static void main(String[] args)
    {
        A obj = (int i) ->  // as we know when we write a obj after that we write new a such that compiler also know 
        // thats why removes this ,this is speciality of lamda expression
         {
                System.out.println("in show");
        }
        ;
        obj.show(5);
        A obj1 = (int i) ->System.out.println("in show" + i);  // if there is only one line inside curly braces then we can reduce code length
        obj1.show(5);
    }
}