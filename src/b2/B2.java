package b2;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        String string1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 1");
        String string2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi 2");
        if (string1.equals(string2)){
            System.out.println("Chuỗi giống nhau");
        }else {
            System.out.println("Chuỗi khác nhau");
        }
    }
}
