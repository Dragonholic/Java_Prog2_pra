import java.util.Scanner;

class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point("+this.x+","+this.y+")";
    }
}

public class Hello {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
        System.out.println(obj.getClass().getName()+"@"+Integer.toHexString(obj.hashCode()));

    }


    public static void main(String[] args) {

        Point p = new Point(100, 200);
        print(p);
        System.out.println(p);

    }
}