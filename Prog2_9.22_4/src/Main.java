import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("초를 정수로 입력하세요:");

        int ent = scanner.nextInt();

        int hour = ent / 3600;
        int min =  (ent % 3600) / 60;
        int sec =   min % 60;

        System.out.println( hour+ "시간" + min +"분" + sec+"초"         );



    }
}