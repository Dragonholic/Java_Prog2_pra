



interface Caster{
    void cast();
    int cooldown = 5;
}

interface Defender{
    void  defennd(int damage);
    double damageReductionRatio=0.5;
}

interface Attacker {
    void attack();
}

interface  Shooter {
    void shoot();
}

class Creature{
    protected  int HP;
    protected String name;
}

abstract class Warrior extends Creature implements Attacker, Defender{
    protected double aggro;



}

abstract class Wizard extends Creature implements Caster{
    protected  int MP;
    protected double cooltime;
    protected int cost;
}

abstract class Healer extends Wizard{
    abstract  void resurrect();
}

abstract class Monster extends  Wizard implements Attacker {
    protected int gem;

}

class WarriorClass extends Warrior{

    public WarriorClass(String name) {
        super();
        aggro =0;
        this.name = name;
    }

    @Override
    public void defennd(int damage) {
        System.out.println(this.name+"가 막았다.");
        HP-= damage*damageReductionRatio;
    }

    @Override
    public void attack() {
        System.out.println(this.name+"가 공격했다.");
        aggro += 0.1;

    }
}

class WizardClass extends Wizard{

    public WizardClass(String name) {
        super();
        this.name = name;
        MP = 100;
        cooltime = 0;
        cost = 10;
    }

    @Override
    public void cast() {
        if (MP >0){
            System.out.println(this.name+"가 시전했다.");
            MP -= cost;
        } else if (MP == 0) {
            System.out.println("마나부족");
        }
    }
}

class HealerClass extends Healer{

    public HealerClass(String name) {
        super();
        this.name = name;
        MP = 100;
        cooltime = 0;
        cost = 20;
    }

    @Override
    public void cast() {
        System.out.println(this.name+"가 치료했다.");
    }

    @Override
    void resurrect() {
        if (MP >0){
            System.out.println(this.name+"가 부활했다.");
            MP = 0;
        } else if (MP == 0) {
            System.out.println("마나부족");
        }
    }
}



public class MonsterRaidEx extends Monster {

    public MonsterRaidEx(String name) {
        super();
        this.name = name;
        HP = 1000;
        MP = 1000;
        cost = 1;
        gem = 10000;
    }

    @Override
    public void cast() {
        if (MP >0){
            System.out.println(this.name+"가 시전했다.");
            MP -= cost;
        } else if (MP == 0) {
            System.out.println("마나부족");
        }

    }

    @Override
    public void attack() {
        System.out.println(this.name+"가 공격했다.");
    }



    public static void main(String[] args) {

        MonsterRaidEx monster = new MonsterRaidEx("Monster");

        monster.attack();
        monster.cast();

        WarriorClass gildong = new WarriorClass("Gildong");
        WizardClass cheolsoo = new WizardClass("cheolsoo");
        HealerClass younghee = new HealerClass("Youngheee");


        gildong.attack();;
        cheolsoo.cast();
        younghee.resurrect();
    }


}