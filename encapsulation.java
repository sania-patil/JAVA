// encapsulation
class human{
    // if we make these variables as private then we cant access it 
    // different class for that purpose we make method
   private int age;
   private String name;

   public int getAge()
   {
    return age;
   }

   public void setAge(int a)
   {
    age = a;
    return;
   }

   public String getName()
   {
    return name;
   }

   public void setName(String s)
   {
    name = s;
    return;
   }
}
class encapsulation{
    public static void main(String[] args){
        human obj = new human();
        // we call above method by class object
        obj.setAge(30);
        obj.setName("saniya");
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}

// by accepting values
// import java.util.Scanner;
// class human{
//     // if we make these variables as private then we cant access it 
//     // different class for thart purpose we make method
//    private int age;
//    private String name;

//    public int getAge()
//    {
//     return age;
//    }
//     public void setAge(int n)
//     {
//         age = n;
//     }
//    public String getName()
//    {
//     return name;
//    }
//    public void setName(String s)
//    {
//     name = s;
//    }
// }
// class encapsulation{
//     public static void main(String[] args){
//         human obj = new human();
//         obj.setAge(19);
//         obj.setName("Saniya");
//          System.out.println(obj.getName() + ":" + obj.getAge());
//     }
// }