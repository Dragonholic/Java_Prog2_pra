import java.util.Scanner;

public class replace_zero {
    public static void main(String[] args) {

//
//        byte flag = 0b00001010;
//
//        flag  &= 0b00000000;
//
//
//
//        String msg = (flag==0)? "온도는 o도이하":"온도는 0도 이상";
//
//
//
//        System.out.println(msg);
//
//        System.out.printf("%04x\n", 255);
//        System.out.printf("%a\n",1.255);
//        System.out.printf("%b\n", "hello");
//        System.out.printf("%b\n", String.valueOf(false));
//        LocalDate now = LocalDate.now();
//        System.out.printf("%1$tm - %1$te , %1$tY\n",now);


        int a = 0x10 ;
        int b = 0x28;
        int c = 0x44;
        int d = 0xfE;

        byte a1 = (byte) (a <<2);
        byte b1 = (byte) (b <<2);
        byte c1 = (byte) (c <<2);
        byte d1 = (byte) (d <<2);


        String A = Integer.toBinaryString(a1);
        String B = Integer.toBinaryString(b1);
        String C = Integer.toBinaryString(c1);
        String D = Integer.toBinaryString(d1);



        System.out.println(String.format("%10s",A).replaceAll("0", " "));
        System.out.println(String.format("%10s",B).replaceAll("0", " "));
        System.out.println(String.format("%10s",C).replaceAll("0", " "));
        System.out.println(String.format("%10s",D).replaceAll("0", " "));


        byte a2 = (byte) (a >>>2);
        byte b2 = (byte) (b >>>2);
        byte c2 = (byte) (c >>>2);
        byte d2 = (byte) (d >>>2);


        String A1 = Integer.toBinaryString(a2);
        String B1 = Integer.toBinaryString(b2);
        String C1 = Integer.toBinaryString(c2);
        String D1 = Integer.toBinaryString(d2);



        System.out.println(String.format("%10s",A1).replaceAll("0", " "));
        System.out.println(String.format("%10s",B1).replaceAll("0", " "));
        System.out.println(String.format("%10s",C1).replaceAll("0", " "));
        System.out.println(String.format("%10s",D1).replaceAll("0", " "));





    }
}