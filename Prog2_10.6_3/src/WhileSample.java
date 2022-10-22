
import java.util.Scanner;
public class WhileSample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요\n");
        int a = 0;
        int sum = 0;
        int count = 0;
        while(a != -1){
            a = scanner.nextInt();
            if(a != -1){
            sum += a;
            count ++;}
        }
        double ra = sum/count;

        System.out.println("정수의 갯수는" +count+"개 이며 평균은"+ra+"입니다.");

        System.out.println("Hello world!");
    }
}