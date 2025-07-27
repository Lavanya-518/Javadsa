import java.util.*;

public class string15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] b = sc.nextLine().toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "yes" : "No");
        sc.close();
    }
}
