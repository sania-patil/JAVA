// write a program to displaly number of characters and words in text
import java.util.Scanner;
class demo
{
    String k = "welcome to PCCOE";
    int sum=0;
    void  characters()
    {
        // int sum=0;
        for(int i=0; i<=k.length();i++)
        {
            if((k.charAt(i)>= 'a' && k.charAt(i) <='z') || (k.charAt(i)>='A' && k.charAt(i)<='Z'))
            {
                sum=+1;
            }
        }
    }
    // System.out.println("number of characters:" + sum);
    System.out.println(sum);
}

    void words()
    {
        int words=0;
        for(int i=0;i<=k.length();i++)
        {
            if(k.charAt(i)==' ')
            {
                words=words+1;
            }
        }
        System.out.println("number of words:" + words);
    }
class assi2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       demo deo = new demo();
       System.out.println("1=count for characters,2=count of words");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                deo.characters();
                break;

            case 2:
                deo.words();
                break;
        }
    }
}
