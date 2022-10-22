import java.util.Scanner;

public class Exception_zero {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int a,b;
        System.out.println("나누어 질 수:");
        a = scanner.nextInt();
        System.out.println("나눌수:");
        b = scanner.nextInt();

        try {
            System.out.println("a/b=" +(a/b));
        } catch (ArithmeticException ae) {
            System.out.println("0으로 나눌 수 없음");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        } finally {
            System.out.println("끝!!");
        }

        scanner.close();
    }
}