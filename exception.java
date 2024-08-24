class MyException extends Exception
{
    public MyException(String string)
    {    
        super(string);
    }
}
class exception{
    public static void main(String[] args){
        int i=2;
        int j=1;
        // String ch = "A";
        // String wh = "a";
        int nums[] = new int[5];
        try  // it try to execute statement
        {
            j=18/i;
            System.out.println(nums[1]);
            //  System.out.println(nums[5]);
            //  System.out.println(ch==wh);

            if(j==0)
            {
            throw new ArithmeticException();  //throw keyword
            }

            // custom exception
            if(j==1)
            {
                throw new MyException("i dont want print any thing");
            }
        }

        // if single statement in try block wrong then catch block execute to avoid this we write type of exception 
        // such that aithomatic exception array index out of bounds
          // if try statement is wrong then it catch this
        // catch(Exception obj)  // if try statement is wrong then it catch this
        // {
        //     System.out.println("something went wrong! " + obj);
        // }
        catch(ArithmeticException e)
            {
                System.out.println("you cannot divide by zero");
            }
        catch(ArrayIndexOutOfBoundsException obj1)
        {
            System.out.println("out of index");
        }
        // if we dont know the type of exception then write only exception
        catch(Exception obj)  // if try statement is wrong then it catch this
        {
            System.out.println("something went wrong! " + obj);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}