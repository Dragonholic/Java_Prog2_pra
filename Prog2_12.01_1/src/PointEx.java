class Point {
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public boolean equals(Object obj){
        Point p = (Point) obj;
        return (this.x == p.x && this.y == p.y);
    }

}

public class PointEx {
    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(1,2);
        Point c;
        c = a;

        Integer i = Integer.valueOf("123");
        Character cr = Character.valueOf('a');






        if (a.equals(b)){
            System.out.println("같다.");
        }else System.out.println("다르다.");

        if (a == c ){
            System.out.println("같다.");
        }else System.out.println("다르다.");






        System.out.println("Hello world!");
    }
}