package models;
import java.util.HashSet;
import java.util.Scanner;
public class StudentHashSet {
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
    public void HienThiThongTin(HashSet<StudentHashSet> stdHS){
        int count=0;
        System.out.println("\nDanh sach sinh vien: ");
        for (StudentHashSet studentHS : stdHS) {
            count++;
            System.out.printf("Sinh vien thu %d la: ",count);
            System.out.println("Ho va ten: " + studentHS.fullName);
            System.out.println("Tuoi: " + studentHS.age);
        }
    }

    //them moi thong tin
    public void AddThongTin(HashSet<StudentHashSet> stdHS,int n){
        System.out.println("Nhap so luong sinh vien ban muon them: ");
        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StudentHashSet std=new StudentHashSet();
            System.out.println("Nhap sinh vien thu "+ (stdHS.size()+1)+":");
            std.NhapThongTin();
            stdHS.add(std);
        }
    }
    //sua thong tin
    public void EditThongTin(HashSet<StudentHashSet> stdHS){
        int count = 0;
        System.out.print("Nhap so thu tu sinh vien ban muon sua: ");
        Integer stt = scanner.nextInt();
        StudentHashSet student = new StudentHashSet();
        for(StudentHashSet studentHS : stdHS){
            count++;
            if(stt==count){
                System.out.println("So thu tu "+ (1) + " co ten la: " + studentHS.fullName);
                System.out.println("Nhap Thong tin moi thay the: ");
                student.NhapThongTin();
            }
            else if(stt!=stdHS.size()){
                System.out.printf("Khong tim thay stt %d trong danh sach",stt);
            }
        }
    }
    //xoa thong tin
    public void XoaThongTin(HashSet<StudentHashSet> stdHS){
        System.out.println("Nhap so thu tu sinh vien ban muon xoa: ");
        Integer stt = scanner.nextInt();
        for(StudentHashSet studenHS : stdHS){
            if(stt == 1){
                stdHS.remove(studenHS);
                System.out.println("Da xoa sinh vien co stt: " + stt);
            }
            else {
                System.out.printf("Khong có sinh vien stt %d trong danh sach", stt);
            }
        }
    }
}