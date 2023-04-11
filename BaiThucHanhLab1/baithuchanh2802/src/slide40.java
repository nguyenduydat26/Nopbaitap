
 import java.util.Scanner;
public class slide40 {
    
public static void main(String[] agrs) {
  Scanner sc = new Scanner(System.in);
   
  System.out.println("nhap so bat ki tu 1- 7");
  int a = sc.nextInt();
 
   switch( a) {
   case 1:
    System.out.println("thu 2");
    break;
   case 2:
    System.out.println("thu 3");
    break;
   case 3:
    System.out.println("thu 4");
    break;
   case 4:
    System.out.println("thu 5");
    break;
   case 5:
    System.out.println("thu 6");
    break;  
   case 6:
    System.out.println("thu 7");
    break;
   case 7:
    System.out.println("cn");
    break;
  default:
   System.out.println("so vua nhap ko hop le");
   }
  }
}