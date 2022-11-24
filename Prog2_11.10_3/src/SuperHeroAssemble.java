import java.security.PublicKey;

class Life{

    private int Hp =10;
    void setHp(int Hp){
        this.Hp = Hp;
    }

    public int getHp() {
        return Hp;
    }

    public String name = "";

    void Eat(int n){
        Hp += n;
    }
    void Poop(int n){
        Hp -= n;
    }
}

class Person extends Life{
    private int INT =5;

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    void Study(int n){
        INT +=n;
    }
    void Stopthink(int n){
        INT -=n;
    }
}

class SuperHero extends Person{
    private double SKILL = 0;

    public double getSKILL() {
        return SKILL;
    }

    void setSKILL(double SKILL){
        this.SKILL = SKILL;
    }

    double Fly(double n){
        SKILL -=n;
        return n*0.7;
    }
    void Train(double hour){
        SKILL += hour/24;
    }


}





public class SuperHeroAssemble {
    public static void main(String[] args) {

        SuperHero sMan = new SuperHero();
        SuperHero bMan = new SuperHero();
        SuperHero iMan = new SuperHero();


        sMan.name = "sMan";
        sMan.setHp(1000);
        sMan.setINT(10);
        sMan.setSKILL(100);


        bMan.name = "bMan";
        bMan.setHp(150);
        bMan.setINT(500);
        bMan.setSKILL(80);

        iMan.name = "iMan";
        iMan.setHp(100);
        iMan.setINT(550);
        iMan.setSKILL(150);




        System.out.println("이름  체력  지능  초능력");
        System.out.println(sMan.name +" "+ sMan.getHp() +"  "+sMan.getINT() +"  "+ (int)sMan.getSKILL());
        System.out.println(bMan.name +" "+ bMan.getHp() +"  "+bMan.getINT() +"  "+ (int)bMan.getSKILL());
        System.out.println(iMan.name +" "+ iMan.getHp() +"  "+iMan.getINT() +"  "+ (int)iMan.getSKILL());



    }
}