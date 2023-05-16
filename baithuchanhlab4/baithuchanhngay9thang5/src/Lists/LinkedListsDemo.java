package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Student.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedList=new LinkedList<>();
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
            linkedList.add(std);
        }
        //hien thi
        student.HienThiThongTin(linkedList);
        //them moi
        student.AddThongTin(linkedList, n);
        //hien thi
        student.HienThiThongTin(linkedList);
        //chinh sua thong tin
        student.EditThongTin(linkedList);
        //hien thi
        student.HienThiThongTin(linkedList);
        //xoa
        student.XoaThongTin(linkedList);
        //hien thi
        student.HienThiThongTin(linkedList);      
    
    }
}