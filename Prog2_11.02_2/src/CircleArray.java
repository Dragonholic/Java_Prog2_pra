class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getN(int N){
        N = 100;
        return N;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}


public class CircleArray{
    public static void main(String[] args) {

        Circle [] circles;
        circles = new Circle[5];

        for (int i=0; i<5; i++){
            circles[i] = new Circle(i);
            System.out.println((int)circles[i].getArea());
        }



    }
}