class Life{
    String name;
    public Life(){  name = "";}
    public Life(String name){
        this.name = name;
        }
}

class Animal extends Life{
    int nLegs;
    public Animal(){
        nLegs = 4;
    }
    public Animal(String name){
        super(name);
        nLegs = 2;
    }
}

class Human extends Animal{
    int brain;
    public Human(){
        brain = 100;
    }
    public  Human(String name){
        super(name);
        brain = 120;
    }
}




public class UpcastingEx {

    static void print(Life x){
        System.out.println("name : "+x.name);
        if(x instanceof Animal) {
            Animal a = (Animal) x;
            System.out.println("nLegs : "+a.nLegs);
        }
        if (x instanceof Human) {
            Human h = (Human) x;
            System.out.println("Human : "+ h.brain);
        }

        System.out.println("\n");
    }




    public static void main(String[] args) {


        Human gildong =new Human("길동");

        Life earth01 = gildong;

        Life earth02 = new Human("영희");

        Human cheolsoo = (Human) earth01;
        Human younghee = (Human) earth02;



        print(gildong);
        print(earth01);
        print(earth02);
        print(younghee);
        print(cheolsoo);





//        System.out.println(younghee.name);
//        System.out.println(younghee.brain);
//        System.out.println(cheolsoo.name);
//        System.out.println(cheolsoo.brain);
//
//
//        System.out.println(gildong.brain);
//        System.out.println(earth01.name);







    }
}