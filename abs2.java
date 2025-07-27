abstract class First {
    abstract void sum(int a, int b);
    abstract void mul(int a, int b);
}

// Note: Second is still abstract because it doesn't implement all abstract methods
abstract class Second extends First {
    // Concrete implementation of sum
    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    // mul remains abstract, so Second must stay abstract
}

class Third extends Second {
    // Implementing mul here
    void mul(int a, int b) {
        System.out.println("Mul = " + (a * b));
    }
}

public class abs2 {
    public static void main(String[] args) {
        Third ob = new Third();
        ob.sum(100, 200);
        ob.mul(5, 6);
    }
}
