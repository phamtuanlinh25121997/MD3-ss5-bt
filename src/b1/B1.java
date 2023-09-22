package b1;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập 1 chuỗi bất kỳ");
        String str =scanner.nextLine();
        if (str.isEmpty()){
            System.out.println("chuỗi rỗng");
        }else {
            System.out.println("chuỗi không rỗng");
        }
    }
}
