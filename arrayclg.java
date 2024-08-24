import java.util.Scanner;
class arrayclg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements :");
        for(int i=0;i<n;i++)
        {
            // System.out.print("enter array elements :");
            arr[i] = sc.nextInt();
        }

        System.out.print("array elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // elements of array in reverse order
        System.out.print("reverse array elements are : ");

         for(int i=0;i<n;i++){
            System.out.print(arr[n-i-1]+" ");
        }   

        // sum of array elements
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print("sum of array elements are : " + sum);

        // copy array elements from one array to another

        int[] arr2 = new int[n];
        // for(int i=0;i<n;i++){
            arr2 =arr;
        // }
        System.out.print("copied array elements are :" + arr2 );
    }
}