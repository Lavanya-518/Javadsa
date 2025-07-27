interface first{
    abstract void sum(int a, int  b);
}
 interface second extends first {
    abstract void mul(int a, int b);

 }interface Third extends second {
    abstract void sub(int a,int b);

 }interface fourth extends Third {
    abstract void div(int a,int b);
 }
 public void sum(int a,int b){
    System.out.println(a+b);
 }
 public void mul(int a,int b){
    System.out.println(a*b);
 }  
 public void sub(int a,int b){
    System.out.println(a-b);
}


