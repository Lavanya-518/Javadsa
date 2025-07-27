import java.util.Scanner;

public class strin2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String result="";
        int n= a.length();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            result+=a.charAt(i);

        }
        System.out.println(result);



    }
    
}
