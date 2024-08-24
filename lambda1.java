@FunctionalInterface
interface A
{
   public int add(int i , int j);
}

class lambda1
{
    public static void main(String[] args)
    {
        A obj = (i,j) -> i+j;  //for single we dont need to mention keyword
        // obj.add(5,4);
        int result = obj.add(5,4);
        System.out.println(result);
    }
}