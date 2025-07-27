import java.util.*;
public class string9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        int vcount=0,count=0;
        String res="";
        char[] array = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
              str = str.replace(str.charAt(i),'@');


            }
             }
            
             System.out.println(str);
    
}
}
