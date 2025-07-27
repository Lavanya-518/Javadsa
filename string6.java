import java.util.Scanner;

public class string6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char[] reverse = str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char temp = reverse[left];
            reverse[left]=reverse[right];
            reverse[right]=temp;
            left++;
            right--;




        }
        String result = new String(reverse);
        if(result.equals(str)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }

        }
        


        }
       



    
    

