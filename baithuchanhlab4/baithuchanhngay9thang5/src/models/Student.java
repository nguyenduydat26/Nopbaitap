package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student {
    Scanner scanner=new Scanner(System.in);
    private String fullName;
    private int age;
    //nhap 
    public void NhapThongTin(){
        System.out.print("Nhap FullName: ");
        fullName=scanner.nextLine();
        System.out.print("Nhap Age: ");
        age=scanner.nextInt();
    }
    //hien thi
    public void HienThiThongTin(List<Student> stdList){
        System.out.println("\nDanh sach sinh vien: ");
        for (int i = 0; i < stdList.size(); i++) {
            System.out.printf("Sinh vien thu %d la: ",i+1);
            System.out.println();
            System.out.print("Ho va ten: "+ stdList.get(i).fullName);
            System.out.println();
            System.out.print("Tuoi: "+ stdList.get(i).age);
            System.out.println();
        }
    }

    //them moi thong tin
    public void AddThongTin(List<Student> stdList,int n){
        System.out.println("Nhap so luong sinh vien ban muon them: ");
        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Student std=new Student();
            System.out.println("Nhap sinh vien thu "+ (stdList.size()+1)+":");
            std.NhapThongTin();
            stdList.add(std);
        }
    }
    //sua thong tin
    public void EditThongTin(List<Student> stdList){
        System.out.print("Nhap so thu tu sinh vien ban muon sua: ");
        Integer stt = scanner.nextInt();
        Student student = new Student();
        for(int i=0; i<stdList.size();i++){
            if(stt==i+1){
                System.out.println("So thu tu "+ (i+1) + " co ten la: " + stdList.get(i).fullName);
                System.out.println("Nhap Thong tin moi thay the: ");
                student.NhapThongTin();
                stdList.set(i, student);
            }
            else if(stt!=stdList.size()){
                System.out.printf("Khong tim thay stt %d trong danh sach",stt);
            }
        }
    }
    //xoa thong tin
    public void XoaThongTin(List<Student> stdList){
        System.out.println("Nhap so thu tu sinh vien ban muon xoa: ");
        Integer stt = scanner.nextInt();
        for(int i=0;i< stdList.size();i++){
            if (stt == i+1) {
                stdList.remove(i);
                System.out.println("Da xoa sinh vien co stt: " + stt);
            } else {
                System.out.printf("Khong có sinh vien stt %d trong danh sach", stt);
            }
        }
    }
}