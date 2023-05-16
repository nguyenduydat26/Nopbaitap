package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import Student.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n;
        Student student = new Student();
        System.out.println("Nhap vao so luong sinh vien: ");
        n=sc.nextInt();
        //Nhap 
        for(int i=0;i<n;i++){
            Student std = new Student();
            System.out.println("Nhap sinh vien thu "+ (i+1)+":");
            std.NhapThongTin();
            arrayList.add(std);
        }
        //hien thi
        student.HienThiThongTin(arrayList);
        //them moi
        student.AddThongTin(arrayList, n);
        //hien thi
        student.HienThiThongTin(arrayList);
        //chinh sua thong tin
        student.EditThongTin(arrayList);
        //hien thi
        student.HienThiThongTin(arrayList);
        //xoa
        student.XoaThongTin(arrayList);
        //hien thi
        student.HienThiThongTin(arrayList);
    }
}