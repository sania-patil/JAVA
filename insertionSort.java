// class insertionSort{
//     public static void array(int arr[])
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 9,};
//         for(int i=1;i<arr.length;i++)
//         {
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current<arr[j])
//             {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1]=current;
//         }
//         array(arr);
//     }
// }

// another method
class insertion{
    public static void main(String[] args) {
        int[] arr = {9,2,1,4,6};
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j = i-1;
            while(j>0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}