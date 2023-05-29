import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // nhap day so
        System.out.print("Nhap vao cac so nguyen: ");
        int nhap;
        while ((nhap = sc.nextInt()) != -1) {
            numbers.add(nhap);
        }
        // Tim so nguyen lon nhat
        int max = Collections.max(numbers);
        System.out.println("So nguyen lon nhat la: " + max);
        // Nhap so nguyen va xoa khoi mang
        System.out.print("Nhap vao so nguyen can xoa: ");
        int deleteNum = sc.nextInt();
        numbers.removeIf(num -> num == deleteNum);
        // Sap xep day so
        Collections.sort(numbers);
        // In day so
        System.out.println("Day so sau khi sap xep va xoa phan tu: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}