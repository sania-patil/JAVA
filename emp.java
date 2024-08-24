import java.util.Scanner;
// class info{
//     int age;
//     char name;
// }
class emp{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      String name = sc.next();
      System.out.println("name is:"+ name);  
      System.out.println("age is:"+ age);
    }
}



class computer {
    public static void main(String[] args) {
       get obj=new get();
       obj.givepen();
       String str = obj.tax(1000);
        System.out.println( str);
    }
}
class get{
    public void givepen()
    {
         System.out.println("give me pen");
    }
    public String tax(int cost)
    {
        return "tax";
    }
}

// method overloading::same method but different parameter list with different data types
public class demo{
    public static void main(String[] args) {
      calculator obj = new calculator();
      int r= obj.add(2,3,4);
      System.out.println(r);
      
      int r1= obj.add(2,4);
      System.out.println(r1);
      
    //   int r2= obj.add(2.5000,3.5000);
    //   System.out.println(r2);
       
    }
}
class calculator{
    public int add(int n1,int n2,int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1,int n2)
    {
         return n1 + n2;
    }
     public float add(float n1,float n2)
    {
         return n1 + n2;
    }
    
}




