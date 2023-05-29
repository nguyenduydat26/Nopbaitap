import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Slide113 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<String> fruitArr = new HashSet<>();
        ArrayList<String> fruitArr2 = new ArrayList<>();
        int n;
        String fruitName, deleteFruit, fruitName2;

        // Them trai cay
        System.out.println("Nhap so trai cay muon co: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Fruit: ");
            fruitName = sc.next();
            fruitArr.add(fruitName);
        }
        System.out.printf("So phan tu trong mang la: %d \n", fruitArr.size());

        // Xoa trai cay
        System.out.println("Nhap ten trai cay can xoa: ");
        deleteFruit = sc.next();
        for (int i = 0; i < fruitArr.size(); i++) {
            if (fruitArr.contains(deleteFruit)) {
                System.out.println("Co ton tai !");
                fruitArr.remove(deleteFruit);
                break;
            } else {
                System.out.println("Khong ton tai !");
            }
        }
        Iterator<String> listIterator = fruitArr.iterator();

        System.out.print("Mang fruit sau khi da xoa la: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }

        // Them vao fruit2
        System.out.println("Nhap so trai cay muon co vao list 2: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Fruit: ");
            fruitName2 = sc.next();
            fruitArr2.add(fruitName2);
        }

        for (int i = 0; i < fruitArr2.size(); i++) {
            fruitArr.add(fruitArr2.get(i));
        }

        Iterator<String> fruit = fruitArr.iterator();

        System.out.print("Hop hoa qua cua hai mang la: ");
        while (fruit.hasNext()) {
            System.out.print(fruit.next() + "\n");
        }

        for (int i = 0; i < fruitArr2.size(); i++) {
            fruitArr.remove(fruitArr2.get(i));
        }

        Iterator<String> backHashSet = fruitArr.iterator();

        System.out.print("Hop hoa qua cua hai mang la: ");
        while (backHashSet.hasNext()) {
            System.out.print(backHashSet.next() + "\n");
        }
    }
}