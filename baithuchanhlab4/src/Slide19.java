import java.util.ArrayList;
import java.util.ListIterator;
public class Slide19 {
    public static void main(String[]args) {
        //khai báo 1 ArrayList có tên là arrListChar
        //có kiểu là Character
        ArrayList<Character> arrListChar = new ArrayList<>();
        //thêm các phần tử sử dụng phương thức add()
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        //khai báo một Listterator có kiểu là Character
        ListIterator<Character> listIterator = arrListChar.listIterator();
        //hiển thị các phần tử có trong arrListChar
        //bằng cách sử dụng ListIterator
        System.out.println("Cac phan tu co trong arrListChar la:");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t"); 
        }
    }
}