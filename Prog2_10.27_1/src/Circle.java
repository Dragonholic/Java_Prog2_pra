import java.nio.channels.Pipe;

public class Circle {

    int radius;
    String name;

    public Circle() {
        this(1, " ");
        radius = 1;
        name = "";

    }

    public Circle(int radius, String n) {
        this.radius = radius;
        name = n;

    }

    static void increase (int [] a){
        for (int i =0; i < a.length; i++){
            a[i]++;
        }
    }

    public double getArea(){
        return 3.14*radius*radius;
    }




    public static void main(String[] args) {
        Circle pizza, pizza2;
        Circle [] pizzaArray; // pizzaArray[];



        pizzaArray = new Circle[5];

        System.out.println(pizzaArray[3].radius);


        for(int i=0; i<5; i++){
            pizzaArray[i] = new Circle(i,"");
        }

        pizza = pizzaArray[3];
        System.out.println(pizza.name+"'s r="+pizza.radius);

        pizza = new Circle();
        System.out.println(pizza.name+"'s r="+pizza.radius);

        pizza2 = pizza;

        // pizza.radius = 10;
        // pizza.name = "자바피자";




        // double area = pizza.getArea();
//        pizza2 = new Circle(77,"다트판");
//        System.out.println(pizza2.name+"'s r="+pizza2.radius);

        pizza.increase(a);
        for (int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }




//        Circle donut = new Circle();
//        donut.radius = 2;
//        donut.name = "java donut";
//        double d_area = donut.getArea();
//
//        Circle tire = new Circle();
//        tire.radius = 100;
//        tire.name = "java tire";
//        double t_area = tire.getArea();
//
//        Circle cola = new Circle();
//        cola.radius = 1;
//        cola.name = "java donut";
//        double c_area = cola.getArea();
//
//
//
//
//        System.out.println(pizza.name+"'s area = ");
//        System.out.println(donut.name+"'s area = "+d_area);
//        System.out.println(tire.name+"'s area = "+t_area);
//        System.out.println(cola.name+"'s area = "+c_area);
    }
}