import java.util.Scanner;

public class MultiArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng và số cột: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0; i<n;i++){
            for(int j = 0; j <n; j++){
                System.out.printf("Nhập phần tử thứ %d %d: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j = 0; j <n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void input(int [][]arr, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< n ;i++){
            for(int j = 0; j <n; j++){
                System.out.printf("Nhập phần tử thứ %d %d: ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void show(int [][]arr, int n){
        for(int i=0; i<n; i++){
            for(int j = 0; j <n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
