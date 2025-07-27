import java.util.Arrays;

public class arr2 {
    public static void main(String[]args){
        int a[]={2,4,3,6};
        int b[]={6,8,4,9};
        int n=a.length,m=b.length;
        int d[]=Arrays.copyOf(a,m+n);
        for(int i=0;i<m;i++){
            d[n+i]=b[i];
        }
        Arrays.sort(d);
        System.out.print(Arrays.toString(d));


        

        }

   
    }

    


    

