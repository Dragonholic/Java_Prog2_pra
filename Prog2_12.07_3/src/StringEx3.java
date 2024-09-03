import java.util.StringTokenizer;

public class StringEx3 {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("I had seen little of Holmes lately.  My marriage had drifted us away from each other. My own complete happiness, and the home-centred interests which rise up around the man who first finds himself master of his own establishment, were sufficient to absorb all my attention, while Holmes, who loathed every form of society with his whole Bohemian soul, remained in our lodgings in Baker Street, buried among his old books, and alternating from week to week between cocaine and ambition, the drowsiness of the drug, and the fierce energy of his own keen nature."
                ,".,", true);
        while (st.hasMoreElements()){
            String prt = st.nextToken();
            if (prt.equals(".") ||prt.equals(",")){
                System.out.print(prt+"\n");
                continue;
            }

            if(prt.contains("Holmes")){
                prt = prt.replace("Holmes", "홈즈");
            }
            if (prt.contains("Bohemian")){
                prt = prt.replace("Bohemian","보헤미안");
            }
            if (prt.contains("Baker")){
                prt = prt.replace("Baker","베이커");
            }

            System.out.print(prt.trim());
        }















    }
}