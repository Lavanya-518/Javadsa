
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String result="";
        StringBuilder sb= new StringBuilder(a);
        result+=sb.reverse();
         System.out.println(result);



    }
    
}
