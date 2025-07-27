import java.util.Scanner;

public class string14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }

        System.out.println(result.trim());
       
    }
}
