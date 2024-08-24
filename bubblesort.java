import java.util.Scanner;
class bubblesort{

    // make method to print array elements
    public static void array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input array from user
        System.out.println("Enter the number of elements in the array");
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int k=0;k<n;k++)
        {
            System.out.println("Enter the element at index " + k);
            arr[k]=sc.nextInt();
        }

        // time complexity = O(n^2)

        // compare each element to its adjacent elements
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        array(arr);
    }
}