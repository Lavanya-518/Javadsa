public class arr8 {
    public static void main(String[] args){
        int a[] = {12,345,2,6,7896};
        int t=0;
        int c=0;
        int c2=0;
        for(int i=0;i<a.length;i++){
            t=a[i];
            while (t>0){
            t=t/10;
            c++; 
           
        }
        if(c%2==0){
            c2++;
        }

    }
    System.out.print(c2);
    
}
}
