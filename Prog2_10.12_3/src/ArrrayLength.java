import java.util.Scanner;

public class ArrrayLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Array[];
        System.out.println("배열의 갯수를 입력하세요");
        int k = scanner.nextInt();
        Array = new int[k];

        System.out.println("n개의 정수를 입력하세요");
        for (int i =0; i<Array.length; i++) {
            Array[i] = scanner.nextInt();
        }
        int n =0;

        for (int i =0; i<Array.length; i++) {
        n += Array[i];
        }

        float Sum;
        Sum = (float)n / Array.length;
        System.out.println("평균은" +Sum);

    }
}