import java.util.Scanner;

public class string20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 =sc.nextLine();
        String s =" bcabcabc";
        String result = s.replaceAll("ab","");
        System.out.println(result);
    }
}
