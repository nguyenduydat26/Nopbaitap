
    import java.util.Scanner;

public class slide30 {
    public static void main(String[] arg) {
        int a;
        int tong = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen a:");
        a = scanner.nextInt();
        while (a > 0) {
            tong += a % 10;
            a /= 10;
        }
        System.out.println("Tong cua cac chu so la: " + tong);
    }
}
