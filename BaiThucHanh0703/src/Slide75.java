import java.util.Scanner;

public class Slide75 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row, column, sum = 0;

        do {
            System.out.println("Nhap vao so dong cua mang: ");
            row = sc.nextInt();
        } while (row <= 0);

        do {
            System.out.println("Nhap vao so cot cua mang: ");
            column = sc.nextInt();
        } while (column <= 0);

        int arr[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Nhap vao gia tri phan tu cua mang A[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong so chan cua mang la: " + sum);
    }
}