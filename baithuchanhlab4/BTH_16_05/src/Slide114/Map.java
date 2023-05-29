package Slide114;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Students> hashMap = new HashMap<Integer, Students>();
        Students std = new Students();
        Scanner sc = new Scanner(System.in);
        int n, msv;
        String fullName, classes, classNumber;

        // Nhap n sinh vien
        System.out.print("Nhap so sinh vien: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap msv: ");
            msv = sc.nextInt();
            System.out.print("Nhap ten: ");
            fullName = sc.next();
            System.out.print("Nhap lop: ");
            classes = sc.next();
            hashMap.put(i, new Students(msv, fullName, classes));
        }

        Set<Entry<Integer, Students>> setHashMap = hashMap.entrySet();
        System.out.println(setHashMap);

        System.out.print("Nhap lop muon tim: ");
        classNumber = sc.next();
        for (Entry<Integer, Students> entry : hashMap.entrySet()) {
            if (entry.getValue().classes.equals(classNumber)) {
                System.out.println(entry);
            }
        }

        System.out.print("Nhap msv muon tim: ");
        msv = sc.nextInt();
        for (Entry<Integer, Students> entry : hashMap.entrySet()) {
            if (entry.getValue().msv == msv) {
                System.out.println(entry);
            }
        }
    }
}