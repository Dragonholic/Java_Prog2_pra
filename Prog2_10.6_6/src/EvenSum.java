import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum =0;
        for (int i =0; i<5; i++){
            int a = scanner.nextInt();
            if(a%2 !=0){
            continue;}
             sum += a;
        }
        System.out.println("짝수들의 합은 "+sum);

        System.out.println("Hello world!");
    }
}