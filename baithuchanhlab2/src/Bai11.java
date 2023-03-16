import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);
             
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n < 0);
             
        int array[] = new int[n];
             
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
             
        System.out.println("\nMang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
             
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("\nTong cac phan tu co trong mang = " + sum);
             
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPhan tu nho nhat trong mang la " + array[n - 1]);
    }
}
