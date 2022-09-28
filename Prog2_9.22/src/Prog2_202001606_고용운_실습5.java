import java.io.IOException;
import java.util.Scanner;

public class Prog2_202001606_고용운_실습5 {


    public static void main(String[] args) throws IOException {             //throw IOExcception 이란 - 예외처리 얘한테 시키자
//        byte b = 127;
//        int i = 100;

//        System.out.println((char)0x12340048);
//        System.out.println((char)0x56780065);
//        System.out.println((char)0x1234006c);
//        System.out.println((char)0x5678006c);
//        System.out.println((char)0x1234006f);
//        System.out.println((char)0x5678007e);
//        System.out.println((byte)(b+i) );
//        System.out.println((int) 2.9+1.8);
//        System.out.println((int) (2.9+1.8));
//        System.out.println((int) 2.9+(int)1.8);
//
//        int x = System.in.read();
//
//        System.out.println("x="+x); // 아스키코드 출력
//
//
//        System.out.println("Hello world222!");

        Scanner myScan =new Scanner(System.in);
        String str = myScan.next();
        int num = myScan.nextInt();
        double d = myScan.nextDouble();
        System.out.println("str=  "+str+ "  num=  "+num+  "  d=  "+d);
        myScan.close();


    }
}