import java.util.*;
public class string7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        int vcount=0,count=0;
        char[] input = str.toLowerCase().toCharArray();
        for(char x:input){
            if(x=='a' || x=='e' || x=='i'||x=='o'||x=='u'){
                vcount++;
            }
            else if(x>='a' && x<='z'){
                count++;
            }
        }
        System.out.println("vowels count"+" "+vcount);
         System.out.println("consonants count"+" "+count);



    }
    
}
