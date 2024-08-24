// class array{


// public static void main(String[] args)
// {
//     int[] marks = new int[3];
//     marks[0] = 90;
//      marks[1] = 92;
//       marks[2] = 94;
//     for(int i=0;i<3;i++)
//     {
//         System.out.println(marks[i]);
//     }
//     // define array with initialization
//     int marks[] = {98,90,97};
//      for(int i=0;i<3;i++)
//     {
//         System.out.println(marks[i]);
//     }
// }
// }

// take input from user
// import java.util.Scanner;
// class array{
//     // Scanner sc = new Scanner(System.in);


//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] marks = new int[size];
//         for(int i=0; i<size; i++)
//         {
//             marks[i] = sc.nextInt();
//         }  
//         // instead to define sizze variable we write arrayname.length
//         for(int i=0;i<size;i++)
//         {
//             System.out.println(marks[i]);
//         }
//     }
// }


// multidimensional array
// import java.util.Scanner;
// class array
// {
//     public static void main(String[] args)
//     {   
//         Scanner sc = new Scanner(System.in);
//         int[][]nums = new int[3][4];
//         for(int i =0;i<3;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                 nums[i][j]=sc.nextInt();
//             }
//         }
//          for(int i =0;i<3;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                System.out.print(nums[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


// inhance for loop
// for(int n[] = nums)
// {
//     for(m:n)
//     {
//         System.out.print(m + " ");
//     }
//     System.out.println();
// }

// jagged array

import java.util.Scanner;
import java.lang.Math.*;
class array
{
    public static void main(String[] args)
    {
        int[][]nums = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];

        for(int i=0;i<nums.length ; i++)
        {
            for (int j=0;j<nums[i].length;i++)
            {
                nums[i][j] = (int)(Math.random()*100);
            }
        }
    }
}