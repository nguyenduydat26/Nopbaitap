import java.util.ArrayList;
public class Slide17 {
    public static void main(String[]args) {
        //khai báo 1 ArrayList có tên là arrListString
        //có kiểu là String
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        //thêm các phần tử sử dụng phương thức add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        //duyệt theo kích thước của arrListString
        //sử dụng vòng lặp for thông thường
        //phương thức arrListString.size() sẽ trả về phần tử của arrListString
        //và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        //sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Cac phan tu co trong arrListInteger la:");
        for (int number : arrListInteger){
            System.out.print(number + "\t"); 
        }
    }
}