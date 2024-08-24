import java.util.*;
class factorial{
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number");
    int n = sc.nextInt();
    int facto=1;
    void fact(){
        for(int i=1;i<=n;i++)
        {
            // int facto=0;
            facto= facto*i;
        }
        System.out.println("factorial is:" + facto);
    }
    public static void main(String[] args){
        factorial obj = new factorial();
        obj.fact();
    }
}