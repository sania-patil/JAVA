// 1.Count the total number of characters in a string.
import java.util.Scanner;
class learn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                len++;
            }
        } 
        System.out.println(len);
    }
}

//2.Count the total number of vowels and consonants in a string.
import java.util.Scanner;
class learn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int v=0;
        int c =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u')
            {
                v++;
            }else{
                c++;
            }
        }
        System.out.println("number of Vowels: " + v);
        System.out.println("number of consonants: " + c);
    }
}

// 3. Determine whether two strings are the anagram
// Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different
import java.util.Arrays;
import java.util.Scanner;
class learn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.next();
        System.out.println("Enter second string:");
        String s2 = sc.next();
        // char[] st1;
        // char[] st2;
        if(s1.length()!=s2.length()){
            System.out.println("Strings are not anagram");
        }else{
            char[] st1 = s1.toCharArray();
            char[] st2 = s2.toCharArray();

            Arrays.sort(st1);
            Arrays.sort(st2);

            if (Arrays.equals(st1, st2)) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Strings are not anagram");
            }
        }
    }
}

// find duplicate characters in string
import java.util.Arrays;

class learn {
    public static void main(String[] args) {
        String str = "saniya";
        char[] string = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (string[i] != 0) {
                int count = 1; 
                for (int j = i + 1; j < string.length; j++) {
                    if (string[i] == string[j]) {
                        count++;
                        string[j] = 0;
                    }
                }
                if (count > 1) {
                    System.out.println(string[i]);
                }
            }
        }
    }
}

//  swap two string variables without using third or temp variable.
class learn{
    public static void main(String[] args) {
        String s1 = "saniya";
        String s2 = "patil";
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
    }
}
// Print following Patterns.
class learn{
    public static void main(String[] args){
        int n=4;
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}