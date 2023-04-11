import java.util.Scanner;
public class slide34 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a ");
        int a = scanner.nextInt();
        System.out.println("Nhap b ");
        int b = scanner.nextInt();
        System.out.println("Nhap c ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phuong trinh vo so nghiem!");
                else
                    System.out.println("Phuong trinh vo nghiem");
            } else {
                float x = (float) (-b) / c;
                System.out.printf("Phuong trinh co nghiem la x=%.1f", x);
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.printf("Phuong trinh co nghiem kep la x=%.1f", b / (2 * a));
            } else {
                float x1 = (float) (((-b) + Math.sqrt(delta)) / 2 * a);
                float x2 = (float) (((-b) - Math.sqrt(delta)) / 2 * a);
                System.out.printf("x1 =%1f", x1);
                System.out.println("\b\b");
                System.out.printf("x2 =%1f", x2);

            }
        }
    }
}    

