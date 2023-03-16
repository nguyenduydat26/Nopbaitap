import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Nhap vao so thu 1: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        int secondNumber = scanner.nextInt();
        // Tính tổng,hiệu,tích,thương,phép chia lấy dư của 2 số đó
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);

        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);

        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);

        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + decimalFormat.format(thuong));

        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);

        // Sử dụng các toán tử đã học để so sánh 2 số đó
        System.out.println("ket qua so sanh bang 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber == secondNumber));
        System.out.println("ket qua so sanh khong bang 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber != secondNumber));
        System.out.println("ket qua so sanh lon hon 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber > secondNumber));
        System.out.println("ket qua so sanh lon hon hoac bang 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber >= secondNumber));
        System.out.println("ket qua so sanh nho hon 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber < secondNumber));
        System.out.println("ket qua so sanh nho hon hoac bang 2 so " + firstNumber + " va " + secondNumber + " la "
                + (firstNumber <= secondNumber));
    }
}
