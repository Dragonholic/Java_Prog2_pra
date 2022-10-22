public class Calc {



    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i< args.length; i++){
        sum += Integer.parseInt(args[i],16);
        }





        System.out.println("합계:"+sum);
    }
}