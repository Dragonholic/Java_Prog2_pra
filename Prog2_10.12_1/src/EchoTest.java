import java.util.Objects;
import java.util.Scanner;

public class EchoTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("종료를 입력하면 종료합니다.");


        while (true){
             String a= scanner.nextLine();
             System.out.println(a);
             if(a.equals("종료")){
                 break;
             }

        }
        System.out.println("시스템 종료");



    }
}