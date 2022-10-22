
import java.util.Scanner;



public class Coffeeprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.print("무슨커피 드릴까요?\n");
        String order = scanner.next();

        switch (order) {
            case "에스프레소":
            case "카푸치노":
                System.out.print("4,500원");
                break;
            case "카페라떼":
            case "녹차라떼":
                System.out.print("5,000원");
                break;
            case "아메리카노":
                System.out.print("2,000원");
                break;
            case "INU 스페셜티":
                System.out.print("7,777원");
                break;
            default:
                System.out.print("없는 메뉴입니다.");
                break;

        }
        scanner.close();

    }
}