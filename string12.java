public class string12 {
    public static void main(String[] args){
        String word = "hello";
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) {
               
                for (int j = 0; j <= i; j++) {
                    result.append(ch);
                }
            } else {
               
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
    
 /*
 
 import java.util.*;
public class string9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        int vcount=0,count=0;
        String res=""; 
        for(int=0;i<str.charAt(i))!-1){
        for(int j=o;j<=i;j++){
        res+=str.charAt(i);

 }
        else{
        res+=str.charAt(i)
        }
        } 
        Sytem.out.println(res);       */



