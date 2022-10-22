public class ArrayEX4 {
    public static void main(String[] args) {
        double score[][] = {
                {3.3,4.0,3.4,4.0},
                {3.5,4.0,3.6,4.0},
                {3.7,4.0,4.0,4.0},
                {4.1,4.0,4.2,4.0}
        };
        double sum = 0;
        for (int i = 0; i < score.length; i++)
              { for (int j =0; j < score[i].length; j++){
                  sum += score[i][j];
              }

        }
        double p;
        p = sum/ (score.length * score[0].length);




        System.out.println("전체 평균은" + p);
    }
}