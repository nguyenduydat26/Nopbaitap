package Slide114;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Students {
    public int msv;
    public String fullName;
    public String classes;
    Scanner sc = new Scanner(System.in);

    public Students() {
    }

    public Students(int msv, String fullName, String classes) {
        super();
        this.msv = msv;
        this.fullName = fullName;
        this.classes = classes;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    // public void SearchClass(Set<Entry<Integer, Students>> hashMap, String
    // classNumber) {
    // if (hashMap.contains(classNumber)) {
    // System.out.println("hihi");
    // }
    // }

    @Override
    public String toString() {
        return "msv=" + msv + ",fullName=" + fullName + ",classes=" + classes;
    }

}