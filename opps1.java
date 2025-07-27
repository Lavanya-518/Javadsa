class Oops1 {
    String name;
    int rollno;
    double marks;

    void display(String n, int r,double m) {
        System.out.println("name + "+n );
         System.out.println(" rollno:"+r);
          System.out.println( "marks " + m);
    }

    public static void main(String[] args) {
        Oops1 ob = new Oops1();
        ob.display("lavanay", 518, 0);
}
}