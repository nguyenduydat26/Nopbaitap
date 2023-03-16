import java.util.Scanner;
public class Bai10 {
    public static void main(String[]aegs) {
        Scanner scanner = new Scanner(System.in);
        int LanXuatHien = 0;
        String chuoi;
        char KyTu;
        do{
            System.out.print("Nhap chuoi: ");
            chuoi = scanner.nextLine();
        }while(chuoi.length() > 80);
        System.out.print("Nhap ki tu can dem: ");
        KyTu = scanner.next().charAt(0);
        for (int i=0;i<chuoi.length();i++){
            if(KyTu == chuoi.charAt(i))
                 LanXuatHien++;
        }
        System.out.print("so lan xuat hien ki tu " + KyTu + "trong chuoi \"" + "\" la: " + LanXuatHien + "Lan");
    }
}