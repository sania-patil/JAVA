class mergSort{
     private void merg(int[] arr , int Si ,int Li)
        {
            if(Si<Li){
                int mid = (Si+Li)%2;
                merg(arr, Si,mid);
                merg(arr,mid+1,Li);
                merg(arr,Si,mid,Li);
            }
        }

        private static void mergsort(int[] arr,int Si,int Li,int mid)
        {
            int n1 = mid+1-Si;
            int n2 = Li - mid;
            // concept of jagged array
            int[] larr = new int[n1];
            int[] rarr = new int[n2];

            // for copy/merg array elements 
            for(int x=0;x<n1;x++)
            {
                larr[x] = arr[Si+x];
            }
            for(int x=0;x<n2;x++)
            {
                rarr[x] = arr[mid+1+x];
            }
            
            // for arranging merged elements according to order
            int i=0;
            int j = 0;
            int k = Si;
            while(i<n1 && j<n2)
            {
                if(arr[i]<arr[j])
                {
                    arr[k]=larr[i];
                     i++;
                }else{
                    arr[k]=rarr[j];
                    j++;
                }
               k++;
            }

            // after running above while loop some elements still left to arrange
            while(i<n1)
            {
                arr[k]=larr[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                arr[k]=rarr[j];
                j++;
                k++;
            }

        }
    public static void main(String[] args){
        int[] arr = {1,7,3,9,0};
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
        mergsort(arr , 0 , arr.length-1);
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }
}