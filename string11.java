import java.util.*;
public class string11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res ="";
        char[] array = str.toCharArray();
        for( char ch:array){
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
         System.out.println(res);
   


    }
    
    
}
