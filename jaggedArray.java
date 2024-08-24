// jagged array means every rows has different column size 
import java.util.Scanner;
class jaggedArray{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num[][] = new int[3][];
        // define each row has how many column elements
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[4];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<arr[i]; j++){
                num[i][j] = sc.nextInt();

            }
        }

          for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i]; j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}