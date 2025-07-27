import java.util.Scanner;

public class string16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine().toLowerCase();

       
        int[] counts = new int[26];  

     
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  
                counts[ch - 'a']++;
            }
        }

       
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + counts[i]);
            }
        }

        sc.close();
    }
}
/*
 * string s="apple";
 * int[] count = new int[256];
 * 
 * for(int i=0;i<s.length();i++)
 * char c=s,CharAt(i;
 * count[c]++;
 * }
 * boolean[] printed = new boolean[256];
 * for(int i=0;i<s.length;i++){
 * char c=s.charAt(i);
 * if(!printed[c]){
 * Ssytem.out.println("+":"+count[c]);
 * printed[c]= true;
 * 
 * }
 * 
 * }
 * 
*/