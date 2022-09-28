import java.util.Scanner;


public class Prog2_실습2_EyeTest {
    public static void main(String[] args) {
        System.out.println(("보이는 숫자 2개 입력하세요"));

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(("first = " +a+ "   second= "+b));

        double S = 1.2;
        double A = 1.0;
        double B = 0.8;
        double C = 0.6;
        double N = 0.0;

        boolean k =  (a == 1000 || a ==2000 || a== 3000) || (b==1000 || b==2000 || b ==3000) ? true :false;
        boolean j =  (a == 100 || a ==200 || a== 300) || (b==100 || b==200 || b ==300) ? true :false;
        boolean h =  (a == 10 || a ==20 || a== 30) || (b==10 || b==200 || b ==30) ? true :false;
        boolean g =  (a == 1 || a ==2 || a== 3) || (b==1 || b==2 || b ==3) ? true :false;

        double v = g ? S : (h?A:(j?B:(k?C:N)));


        System.out.println(("시력은 : " +v+ "   //0.0이라고 나온경우 잘못된 숫자 부른것"));

    }
}