class SampleStatic {
    public int n;
    public  void  g(){
        m =20;
    }
    public void h(){
        m =30;
    }
    public static int m;
    public  static  void f(){
        m =5;
    }
}







public class StaticEx {




    public static void main(String[] args) {


        SampleStatic s1, s2;
        SampleStatic.m = 100;
        System.out.println("m="+SampleStatic.m);
        s1 = new SampleStatic();
        s1.n = 5;
        s1.g();;
        s1.m = 50;
        s2 = new SampleStatic();
        s2.n =8;
        s2.h();
        s2.f();
        System.out.println(s1.m);
    }
}