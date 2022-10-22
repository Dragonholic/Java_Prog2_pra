public class TestSum {
    public static void main(String[] args) {
        
        
        int sum = 0;
        
        for (int i = 1; i<=50; i++){
            if(i != 1){
                System.out.print("+");
            }
            System.out.printf("%d",i);
            sum += i;
        }


        System.out.print("\n");
        System.out.printf("= %d",sum);
    }
}