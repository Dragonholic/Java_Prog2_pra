import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //안녕 비교
//        String str1 = "안녕";
//        String str2 = "안녕";
//        String str3 = new String("안녕");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));
//        String str4 = String.format("%s %s\n", "hello" , 123);
//        String str5 = "%s %s/\n".formatted("hello", 123);
//        System.out.println(str4);
//        System.out.println(str5);


        ///////////////////////////////////////////////////////


        //비트 연산
//        short a = (short)0x55ff;
//        short b = (short)0x00ff;
//
//
//        System.out.println("비트여나 결과");
//        System.out.printf("%04x\n", (short)(a & b));
//        System.out.printf("%04x\n", (short)(a | b));
//        System.out.printf("%04x\n", (short)(a ^ b));
//        System.out.printf("%04x\n", (short)(~a));
//
//        byte c= 20; // 0x14
//        byte d= -8; // 0xf8
//
//
//        System.out.println("(시프트연산결과)");
//        System.out.println(c<<2);
//        System.out.println(c>>2);
//        System.out.println(d>>2);
//        System.out.printf("%x\n", (d>>>2));


        /////////////////////////////////////////////////


//
//      //합불 if
//        System.out.print("점수를 입력하시오: ");
//        int score = scanner.nextInt();
//
//        if(score >= 95){
//            System.out.println("축하합니다 합격입니다.");
//        }
//
//        scanner.close();

    ////////////////////////////////////////////////////////////

        // 공배수 판단
//        Scanner in = new Scanner(System.in);
//        System.out.print("수를 입력하시오: ");
//        int nubmer = in.nextInt();
//
//        if (nubmer%3==0 & nubmer%7==0) {
//            System.out.printf("3과 7의 공배수입니다.");
//        }else {
//            System.out.printf("공배수가 아닙니다.");

///////////////////////////////////////////

        // 학점 계산ㄴ
//        String grade;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("점수를 입력하세요(0~100): ");
//        int score = scanner.nextInt();
//
//
//        if (score >= 95){
//          grade = "A+";
//        }else if(score >=90){
//            grade = "A0";
//        }else if(score >=80){
//            grade = "B+";
//        }else if(score >=70){
//            grade = "B0";
//        }else{
//            grade = "F";
//        }
//
//
//        System.out.println("학점은" + grade + "입니다.");
//
//        scanner.close();


        ///////////////////////////////////////////////
//      학년별 합불
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("점수를 입력하세요 (0~100): ");
//        int score = scanner .nextInt();
//
//        System.out.print("학년을 입력하세요 (1~4): ");
//        int year = scanner .nextInt();
//
//
//        if(score >=90 & year == 4 ){
//            System.out.print("합격");
//        }else if(score >=50 & year ==3 | year == 2 | year ==1){
//            System.out.print("합격");
//        }else {
//            System.out.print("불합격");
//        }
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        String grade;
        System.out.print("점수를 입력하세요(0`100): ");
        int score = scanner.nextInt();


        switch (score/10){

            case 10:
                grade = "A+";
                break;

            case 9:
                if (score>=95){
                    grade = "A+";
                }else {
                    grade = "A0";
                }
                break;

            case 8:
                grade = "B+";
                break;
            case 7:
                grade = "B0";
                break;

            default:
                grade = "F";
            break;

        }


        System.out.println("점수는"+grade+"입니다.");











    }
}