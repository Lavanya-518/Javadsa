import java.util.*;
public class arr10 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            
                a[i]=sc.nextInt();
            
        }
        
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    c++;
                }

            }
            ar[i]=c;
        }
        System.out.print(Arrays.toString(ar));

    }
}
