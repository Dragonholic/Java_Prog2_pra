import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public int getArea(){
        return width*height;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        rectangle.height = scanner.nextInt();
        rectangle.width = scanner.nextInt();


        Rectangle cellphone = new Rectangle();
        cellphone.height = scanner.nextInt();
        cellphone.width = scanner.nextInt();



        System.out.println("사각형 면적은 " + rectangle.getArea());
        System.out.println("핸드폰 면적은 " + cellphone.getArea());

    }
}