import java.util.Scanner;
public class slide47 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        String allNumber = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so nguyen: ");
            number = scanner.nextInt();
            allNumber += number + " + ";
            sum += number;
        } while (sum < 100);
        System.out.println(
                "Tong cac so cong lon hon 100: " + allNumber.substring(0, allNumber.length() - 2) + " = " + sum);
    }
}
