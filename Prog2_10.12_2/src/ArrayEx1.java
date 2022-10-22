import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Array1[];
        Array1 = new int[5];

        Array1[0] = scanner.nextInt();
        Array1[1] = scanner.nextInt();
        Array1[2] = scanner.nextInt();
        Array1[3] = scanner.nextInt();
        Array1[4] = scanner.nextInt();

        int a = Array1[0];

        for (int i=0; i<=4;i++ ){

            if( a < Array1[i] && (Array1[i]%2==1) ){
                a = Array1[i];
            }
        }

        System.out.println("가장큰수 홀수는"+a);

    }
}
