class MagicUser{
    protected int cast(){
        return 1;
    }
}


class Mage extends MagicUser{
    protected int cast(){
        return 10;
    }

}


class ArchMage extends MagicUser{
    protected int cast(){
        return 100;
    }

}

class Supreme extends MagicUser{
    protected int cast(){
        return 1000;
    }
}

class Doctor extends MagicUser{
    protected int cast(){
        return 10000;
    }
}




public class OverridingEx {
    public static void main(String[] args) {


        MagicUser gildong;
        gildong = new MagicUser();
        System.out.println("MagicUser 마법위력: " + gildong.cast());


        gildong = new Mage();
        System.out.println("MagicUser 마법위력: " + gildong.cast());

        gildong = new ArchMage();
        System.out.println("ArchMage 마법위력: " + gildong.cast());


        gildong = new Supreme();
        System.out.println("Supreme 마법위력: " + gildong.cast());

        gildong = new Doctor();
        System.out.println("Doctor 마법위력: " + gildong.cast());




    }
}