public class IrregularArray {
    public static void main(String[] args) {
        int intArray[][]= new int[10][];

        for (int i = 0; i< intArray.length; i++) {

            if (i/2 == 1) {
            intArray[i] = new int[i];}
            else intArray[i] = new int[2*i];
        }

        for (int i= 0; i<intArray.length; i++) {

            if (i / 2 == 1) {
                for (int j = 0; j < intArray[i].length; j++) {

                    intArray[i][j] = (i + 1) * 10 + j;
                }
            } else {
                for (int j = 0; j <  intArray[i].length; j++) {

                    intArray[i][j] = (i + 1) * 10 + j;
                }
            }


        }
        for (int i = 0 ; i< intArray.length; i++){
            for (int j =0 ; j< intArray[i].length; j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println(" ");
        }




    }
}