public class overloading {
    void display()
    {
        System.out.println("method overloading");
    }
    void display(int a){
        System.out.println("square:"+(a*a));
    }
    void display(int a,int b){
        System.out.println("product:"+(a*b));

    }
     public static void main(String[] args) {
        overloading ob = new overloading();
        ob.display(); 
        ob.display(5);
        ob.display(10,25);


    
}
}
