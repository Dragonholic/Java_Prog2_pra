package app;
import lib.Calculator;

public class GoodCalc extends Calculator{

    @Override
    public int add(int a, int b) {

        return a+b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {

        double sum = 0;
        for (int i : a){
            sum += i;
        }

        return sum/a.length;
    }

    public static void main(String[] arg){
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(1,2));
        System.out.println(c.substract(3,2));
        System.out.println(c.average(new int [] {1,2,3,4,5}));

    }


}
