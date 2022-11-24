class Person{
}
class Student extends Person{}

class Researcher extends Person{}

class Professor extends Researcher{}




public class InstanceOfEx {

    static void print(Person p){
        if(p instanceof Student){
            System.out.print("Person Student");
        }
        if(p instanceof Researcher){
            System.out.print("Person Researcher");
        }
        if(p instanceof Professor){
            System.out.print("Person Professor");
        }
        System.out.println("\n");
    }







    public static void main(String[] args) {

        System.out.print("new Student()->\t"); print(new Student());
        System.out.print("new Researcher()->\t"); print(new Researcher());
        System.out.print("new Professor()->\t"); print(new Professor());


    }
}