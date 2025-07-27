import java.util.Scanner;

public class arr3 {
    public static void main(String[]args){
        Scanner arr3 = new Scanner(System.in);
        int n=arr3.nextInt();
        int price[]= {7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            price[i]=arr3.nextInt();
        }
        for(int i=0;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            
            }
            else {
            if((price[i]-min) > max){
                max = price[i]-min;
            }
            
            }
        }
    
        System.out.println(max);


        

        }

   
    }

    


