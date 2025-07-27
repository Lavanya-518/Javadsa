import java.util.*;
public class arr12 {
    public static int i;
    public static void main(String[] args){
        int a[]={3,1,2,4};
        int b[]=new int[4];
        int l=0,r=a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b[l]=a[i];
                l++;
            }
            else
            {
                b[r]=a[i];
                r--;

            }

        }
        for(int v:b){
            System.out.println(Arrays.toString(b));
            break;
        }

            
        }
    }
   
    

