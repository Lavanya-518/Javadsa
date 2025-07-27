class Oops1 {
    String name;
    int rollno;
    double marks;

  
    Oops1(String n, int r, double m) {
        name = n;
        rollno = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
       
        Oops1 ob = new Oops1("Lavanya", 518, 58.25);
        ob.display();
    }
}
