import java.util.*;
public class arr15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int [rows] [cols];
        int s1=0;
        int s2=0;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i+j==rows-1){
                    s1+=a[i][j];
                }
                if(i==j){
                    s2+=a[i][j];
                }
                System.out.println(s1-s2);

            }
        }


        }
    
}
