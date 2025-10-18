package InterviewPrep;

//hybrid inheritance using interfaces
interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B extends A {
    default void display() {
        A.super.display();
        System.out.println("Interface B");
    }
}

class C implements B {
    public void display() {

        B.super.display();
        System.out.println("Class C");
    }
}

public class RawConcepts {
    public static void main(String[] args) {
        C obj = new C();
        obj.display(); // Output: Class C

    }
}
