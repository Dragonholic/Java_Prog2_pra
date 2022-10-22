public class ArrayRetTest {


    static int[] makeArray(){
        int[] temp = new int[20];

        for (int i=0,j = 1 ; i<temp.length; i++,j+=2){
        temp[i] = j;}
        return temp;

    }





    public static void main (String[] args) {
            int [] intArray;

        intArray = makeArray();

        for (int i =0; i<intArray.length; i++)
            System.out.print(intArray[i] +" ");






    }

}
