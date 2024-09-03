import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Hello, would!",", !", true);
        while (st.hasMoreElements()){
            System.out.println("Token=" + st.nextToken());
        }







//        StringBuffer sb = new StringBuffer("This");
//        sb.append(" is pencil");
//        System.out.println(sb);
//
//        sb.insert(7," my");
//        System.out.println(sb);
//
//        sb.replace(8, 10, "your");
//        System.out.println(sb);
//
//        sb.delete(8,13);
//        System.out.println(sb);
//
//        sb.setLength(4);
//        System.out.println(sb);




//        String a= new String("  C#");
//        String b = new String(",C++");
//
//
//        System.out.println(a +"의 길이는"+a.length());
//        System.out.println(a.contains("#"));
//
//        a=a.concat(b);  System.out.println(a);
//        a = a.trim();   System.out.println(a);
//
//        a= a.replace("C#","Java");  System.out.println(a);
//
//        String s[] = a.split(",");
//        for (int i=0; i<s.length; i++)  System.out.println("분리된 문자열"+i+":"+s[i]);
//
//
//        a = a.substring(5); System.out.println(a);
//
//        char c = a.charAt(2);   System.out.println(c);

    }
}