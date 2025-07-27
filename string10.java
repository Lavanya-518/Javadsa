import java.util.HashSet; 
public class string10 {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> s = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!s.contains(c)) {
                s.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); 
    }
}
     



    
    





