import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("두 정수를 공백으로 구분하여 입력하세요");
        Scanner scanner = new Scanner((System.in));

        int first = scanner.nextInt();
        int second = scanner.nextInt();



        System.out.println(first+"+"+second+"="+(first+second));
        System.out.println(first+"-"+second+"="+(first-second));
        System.out.println(first+"*"+second+"="+(first*second));
        System.out.println(first+"/"+second+"="+((double)first/(double) second));


        scanner.close();
    }
}