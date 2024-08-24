// 
import java.util.Scanner;
class method{
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        void display()
        {
            System.out.println("first number:" + a);
             System.out.println("second number:" + b);
            return;
        }
        int sum()
        {
            int sum =a+b;
            System.out.println("sum is:" + sum);
            return sum;
        }
    public static void main(String[] args){
        method me =new method();
        me.display();
        me.sum();
    }
}