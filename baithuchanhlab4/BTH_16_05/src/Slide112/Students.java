package Slide112;

import java.util.List;
import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    public String Name;
    public int Point;
    int increase;
    int max = 0;
    String nameSearch;

    public void NhapThongTin() {
        System.out.print("Name: ");
        Name = sc.nextLine();
        if (Name.isEmpty()) {
            System.out.println("Error");
            NhapThongTin();
        }
        System.out.print("Point: ");
        Point = sc.nextInt();

    }

    public void ThemThongTin(List<Students> stdLists, int n) {
        for (int i = 0; i < n; i++) {
            Students std = new Students();
            std.NhapThongTin();
            stdLists.add(std);
        }
    }

    public void Truot(List<Students> stdLists) {
        System.out.println("Sinh vien truot mon:");
        for (int i = 0; i < stdLists.size(); i++) {
            if (stdLists.get(i).Point <= 5) {
                increase++;
                System.out.print("Name: ");
                System.out.println(stdLists.get(i).Name);
                System.out.printf("Point: %d\n", stdLists.get(i).Point);
                // System.out.printf("So sinh vien truot mon: ", increase);
            }
        }
        System.out.print("So sinh vien truot mon: ");
        System.out.println(increase);
    }

    public void DiemCao(List<Students> stdLists) {
        for (int i = 0; i < stdLists.size(); i++) {
            if (stdLists.get(i).Point > max) {
                max = stdLists.get(i).Point;
                System.out.println("Cac sinh vien diem cao la: ");
            }
            ;
            if (stdLists.get(i).Point == max) {
                System.out.print("Name: ");
                System.out.println(stdLists.get(i).Name);
                System.out.printf("Point: %d\n", stdLists.get(i).Point);
            }
        }
    }

    public void TimKiem(List<Students> stdLists) {
        System.out.println("Nhap ten sinh vien muon tim kiem: ");
        nameSearch = sc.nextLine();
        for (int i = 0; i < stdLists.size(); i++) {
            if (stdLists.get(i).Name.equals(nameSearch)) {
                System.out.print("Name: ");
                System.out.println(stdLists.get(i).Name);
                System.out.printf("Point: %d\n", stdLists.get(i).Point);
            }
        }
    }

}