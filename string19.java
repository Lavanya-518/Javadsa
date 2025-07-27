import java.util.Scanner;

public class string19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 =sc.nextLine();
        String result="";
        int i=0;
        while(i <=str1.length()-str1.length()){
            if(str1.substring(i,i+str2.length()).equals(str2)){

            }
            else{
                result += str1.charAt(i);
                i++;
            }

        }
        while (i<str1.length()) {
            result +=str1.charAt(i++);
            
        }
        System.out.println(result);
    
}
}

