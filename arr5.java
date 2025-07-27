public class arr5 {
    public static void main(String[]args){
        int[] a={3,0,1};
        int n=a.length;
        int allsum=n*(n+1)/2;
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(allsum-sum);

    }
    
}
