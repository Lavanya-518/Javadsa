import java.util.Scanner;

public class arr9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=new.nextInt[n];
        int c=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(i==0 || i==1 ){
                c++;
                for(int i=0;i<a.length;i++){
                   if(c>max){
                    max=c; 
                }
                
                }
            }
            else
                c=0;
            
        }
        System.out.print(max);

    }
    
}
