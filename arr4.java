public class arr4 {
    public static int eles(int a[]){
       
        int ts=0;
        int ls=0;
        for(int i=0;i<a.length;i++){
            ts+=a[i];
         }
        for(int i=0;i<a.length;i++){
                if(ls==ts-ls-a[i]){
                    return i;
                

            }
            else
                ls+=a[i];
            

        }
        return-1;
    }
    public static void main(String[] args){
        int a[]={1,7,3,6,5,6};
        System.out.println(eles(a));


        }
    }
    

