import java.util.Arrays;
public class arr1 {
    public static void main(String[]args){
        int a[]={2,4,3,6};
        int b[]={6,8,4,9};
        Arrays.sort(a);
        Arrays.sort(b);
        int copy[] = Arrays.copyOf(a,2);
        System.out.print(Arrays.toString(a));
        System.out.print(Arrays.toString(copy));


        

        }

   
    }

    

