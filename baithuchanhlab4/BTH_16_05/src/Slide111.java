import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        // Nhap cac phan tu vao danh sach lien ket
        System.out.println("Nhap " + n + "so nguyen duong: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        // Tinh trung binh cong cua cac so chan trong danh sach lien ket
        int sum = 0, count = 0;
        for (int num : numbers) {
            if (n % 2 == 0) {
                sum += num;
                count++;
            }
        }
        double avg = (double) sum / count;
        // Hien thi ket qua
        System.out.println("Trung binh cong cac so chan la: " + avg);
    }
}