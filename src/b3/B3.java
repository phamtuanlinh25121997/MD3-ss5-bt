package b3;

public class B3 {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Chuỗi Gốc là : " + str);
        System.out.println("Chuỗi đảo ngược :" + reversed);
    }

    public static String reverseString(String str) {
        StringBuffer buffer = new StringBuffer(str);

        buffer.reverse();
        return buffer.toString();

    }
}
