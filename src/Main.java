import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("Mảng: ");
        for (int[] row : arr){
            for (int element : row){
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.print("Nhập vị trí cột mà bạn muốn tính: ");
        int col = scanner.nextInt();
        if (col < 0 || col > arr[0].length){
            System.out.println("Không có cột này.");
        }else {
            int sum = 0;
            for (int[] row : arr){
                sum += row[col];
            }
            System.out.println("Tổng của cột " + col + " = " + sum);
        }
    }
}
