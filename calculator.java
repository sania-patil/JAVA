import java.util.Scanner;
class calculator {
    
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      void Display()
      {
      System.out.println("first number is:"+ a);  
      System.out.println("second number is:"+ b);
      }
      
      int add()
      {
         int addition = a+b;
          System.out.println("addition of two number is:" + addition);
          return a+b;
      }
      
      int substract()
      {
         int substraction = a-b;
          System.out.println("substraction of two number is:" + substraction);
          return a-b;
          
      }
    
    public static void main(String[] args) {
     calculator c1 = new calculator();
     c1.Display();
     c1.add();
     c1.substract();
     
    }
}