import java.util.Scanner;


public class 시력검사_V2 {
    public static void main(String[] args) {
        System.out.println(("보이는 글자를 공백으로 2번 입력하세요"));

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println(("first = " + a + "   second= " + b));

        double S = 1.2;
        double A = 1.0;
        double B = 0.8;
        double C = 0.6;
        double N = 0.0;

        boolean k = (a.equals("가") || a.equals("나") || a.equals("다")) || (b.equals("가") || b.equals("나") || b.equals("다")) ? true : false;
        boolean j = (a.equals("A") || a.equals("B") || a.equals("C")) || (b.equals("A") || b.equals("B") || b.equals("C")) ? true : false;
        boolean h = (a.equals("ㄱ") || a.equals("ㄴ") || a.equals("ㄷ")) || (b.equals("ㄱ") || b.equals("ㄴ") || b.equals("ㄷ")) ? true : false;
        boolean g = (a.equals("a") || a.equals("b") || a.equals("c")) || (b.equals("a") || b.equals("b") || b.equals("c")) ? true : false;

        double v = g ? S : (h ? A : (j ? B : (k ? C : N)));

        if(v==0.0){
            System.out.println(("측정불가"));
        }else {
            System.out.println(("당신의 시력은 " +v+ "입니다" ));
        }
    }
}