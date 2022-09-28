import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("종류, 이름, 태어난 곳, 나이, 체중, 중성화 여부를 빈칸으로 분리하여 입력하시오");


        Scanner ppscan =new Scanner(System.in);

        System.out.println();
        String str = ppscan.next();

        String name = ppscan.next();

        String bir = ppscan.next();

        int num = ppscan.nextInt();

        double d = ppscan.nextDouble();

        boolean g = ppscan.nextBoolean();


        System.out.println("종류="+str+ "   이름="+name+ "   고향="+bir+ "  나이="+num+  "  체중="+d+ " 중성화="+g);
        ppscan.close();




    }
}