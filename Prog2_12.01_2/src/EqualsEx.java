class Rect{
    private int width;
    private int height;
    private String color;
    public Rect(int width, int heigh, String color){
        this.width = width;
        this.height = heigh;
        this.color = color;
    }


//    public boolean equals(Object obj){
//        Rect r = (Rect) obj;
//
//        return (this.width == r.width && this.height == r.height && this.color == r.color);
//    }

    public boolean equals(Object obj){
        Rect r = (Rect) obj;

        return (this.width*this.height == r.width * r.height && this.color == r.color);
    }
}





public class EqualsEx {
    public static void main(String[] args) {




        Rect a = new Rect(2,3, "red");
        Rect b = new Rect(3,2, "red");
        Rect c = new Rect(3,4, "blue");

        if (a.equals(b))
            System.out.println("a is equal to b");
        if (a.equals(c))
            System.out.println("a is equal to c");
        if (b.equals(c))
            System.out.println("b is equal to c");


        System.out.println("Hello world!");
    }
}