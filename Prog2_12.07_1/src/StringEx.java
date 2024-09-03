public class StringEx {
    public static void main(String[] args) {

        String java = "         Java   ";
        String cpp = "  C++    \t      ";
        System.out.println("java ="+java.concat(cpp));
        System.out.println("java ="+java);
        System.out.println("cpp ="+cpp);
        System.out.println("java ="+ java.trim());
        System.out.println("cpp ="+ cpp.trim());
        String newJava =java.trim();
        System.out.println("1번 index = "+newJava.charAt(1));

        int res =java.compareTo(cpp);

        System.out.println("res="+res);
        if(res == 0){
            System.out.println("같다.");
        } else if (res <0) {
            System.out.println("작다");
        }else {
            System.out.println("크다.");
        }


    }
}