import java.util.Scanner;

public class NhanVien {
    Scanner scanner = new Scanner(System.in);
    final int luong_co_ban = 1000000;
    String name;
    int age;
    double luong;
    float he_so_luong;

    void Nhap() {
        System.out.print("Nhap Ho va Ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap Tuoi: ");
        age = scanner.nextInt();
        System.out.print("Nhap He So Luong: ");
        he_so_luong = scanner.nextFloat();

    }

    void TinhLuong() {
        luong = luong_co_ban * he_so_luong;
    }

    void In() {
        System.out.print("\nHo va Ten: " + name);
        System.out.print("\nTuoi: " + age);
        System.out.print("\nLuong: " + luong);
    }
}