import java.util.Scanner;



public class Prog2_202001606_고용운_실습4 {
    public static void main(String[] args) {
        System.out.println(("A의 나이를 입력 하세요."));
        Scanner scanner = new Scanner(System.in);
        int ageA = scanner.nextInt();
        System.out.println("A는 " + ageA + "살 입니다.");

        int ageB = ageA++;
        System.out.println("B는 " + ageB + "살 입니다.");

        int ageC = ++ageA;
        System.out.println("C는 " + ageC + "살 입니다.");

        int ageD = ageA--;
        System.out.println("D는 " + ageD + "살 입니다.");

        int ageE = --ageA;
        System.out.println("E는 " + ageE + "살 입니다.");
        scanner.close();
    }







}