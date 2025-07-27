import java.util.*;
public class arr7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]={2,5,1,3,4,6};
        int num[]=new int[2*n];
        for(int i=0;i<n;i++){
            num[2*i]=a[i];
            num[2*i+1]=a[n+i];

        }
        for(int i:num){
            System.out.print(i+" ");
        }

    }
    
}
