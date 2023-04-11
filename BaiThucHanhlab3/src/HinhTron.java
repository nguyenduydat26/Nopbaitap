import java.util.Scanner;

public class HinhTron {
    Scanner scanner = new Scanner(System.in);
    final float PI = 3.14f;
    float bankinh;
    float chuvi;
    float dientich;

    public static void main(String[] args) {
    }
    void NhapBanKinh() {
        System.out.print("Nhap ban kinh r: ");
        bankinh = scanner.nextFloat();
    }
    void Tinh() {
        chuvi = 2 * PI * bankinh;
        dientich = PI * (bankinh * bankinh);
    }
    void In() {
        System.out.printf("\nChu vi hinh tron la: %s", chuvi);

        System.out.printf("\nDien tich hinh tron la: %s", dientich);
    }
}