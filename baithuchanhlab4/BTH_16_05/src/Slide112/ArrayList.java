package Slide112;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) throws Exception {
        ArrayList<Students> stdLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Students std = new Students();

        System.out.print("Nhap vao so hoc sinh can dien tt: ");
        int n = sc.nextInt();

        // Them thong tin
        std.ThemThongTin(stdLists, n);

        // Truot
        std.Truot(stdLists);

        // Diem cao nhat
        std.DiemCao(stdLists);

        // Tim kiem hoc sinh
        std.TimKiem(stdLists);
    }
}