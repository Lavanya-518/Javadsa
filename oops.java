class Oops {
    String name;
    int rollno;
    double marks;

    void display() {
        System.out.println(name + " " + rollno + " " + marks);
    }

    public static void main(String[] args) {
        Oops s1 = new Oops();
        s1.name = "Lavanya";
        s1.rollno = 518;
        s1.marks = 58.25;
        s1.display();
    }
}
/*
 * //static variable and static methods.
 * class student2{
 * static string name="abc";
 * static void display()
 * {
 * }}
 */