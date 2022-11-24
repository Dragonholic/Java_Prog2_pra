abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

class GooCalc extends Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {

        int aver =0 ;
        for (int i = 0; i< a.length; i++){
            aver += a[i];
        }

        int k = aver / a.length;

        return k;
    }
}



public class abstractEx {
    public static void main(String[] args) {

        int[] a ={1,2,5,3,6};

   GooCalc gooCalc = new GooCalc();

   System.out.println(gooCalc.add(1,2));
   System.out.println(gooCalc.subtract(9,2));
   System.out.println(gooCalc.average(a));





    }
}