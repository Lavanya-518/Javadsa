import java.util.*;
public class string8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String  str=sc.next();
        int vcount=0,count=0;
        char[] array = str.toLowerCase().toCharArray();
        for(char x:array){
            if("aeiou".indexOf(str)!=-1){
                vcount++;

            }
            else{
                count++;
            }
            System.out.print(vcount);
            System.out.print(count);
        }
    }
}
