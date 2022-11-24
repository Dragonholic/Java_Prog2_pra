class Calc{
    public static int abs(int t){
        if(t<0){
           t = -t;

        }
        return t;
    }
    public static int max(int k,int t){
        if(k > t){
            return k;
        }else if(k<t){
            return t;
        }else {
            return k;
        }
    }
    public static int min(int k, int t){
        if(k<t){
            return k;
        } else if (k>t) {
            return t;

        }else {
            return k;
        }
    }

}


public class CalcEx {
    public static void main(String[] args) {

        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3,-8));


    }
}