class Oops2 {
    String name;
    
    int rollno;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Oops2 ob = new Oops2();
        ob.name = "Lavanya";
        ob.rollno = 518;
        ob.marks = 58.25;
        ob.display();
    }
}
