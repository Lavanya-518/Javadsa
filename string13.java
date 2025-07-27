import java.util.*;
public class string13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res ="";
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                res+=Character.toLowerCase(str.charAt(i));
            }
             if(i%2!=0){
                res+=Character.toUpperCase(str.charAt(i));

             }

        }
        System.out.println(res);
    }
}