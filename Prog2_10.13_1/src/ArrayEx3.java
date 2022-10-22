public class ArrayEx3 {


    enum Direction {동, 서, 남, 북}


    public static void main(String[] args) {
        int [] n = {1,3,5,7,9};
        String menu[]  = {"파스타", "제육덮밥", "짜장면", "돈가스"};

        int sum = 0;
        for (int k: n) {
            System.out.print(k+" ");
            sum += k;
        }
        System.out.print("합은 "+sum+"\n");


        System.out.print("주문가능한 메뉴는 ");
        for (String M :menu){
            System.out.print(" "+M);
        }
        System.out.print("\n");

        for ( Direction D : Direction.values()){
            System.out.print(D+"쪽 ");
        }



    }
}