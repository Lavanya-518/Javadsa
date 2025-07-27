import java.util.*;

public class string18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();  // Read the input string from the user

        int[] freq = new int[256];   // ASCII character frequency array
        char result = ' ';
        int max = 0;

        // Convert string to lowercase (optional, depends on whether you want case-sensitive)
        // str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;

            if(freq[ch] > max){
                max = freq[ch];
                result = ch;
            }       
        }

        System.out.println("Input string: " + str);
        System.out.println("Most frequent character: " + result);
        System.out.println("Frequency: " + max);
    }
}
