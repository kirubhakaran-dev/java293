class Parent {

    protected int number = 100;
}

class Child extends Parent {

    void display() {
        System.out.println(number);
    }
}

public class ProtectedExample {

    public static void main(String[] args) {

        Child c1 = new Child();

        c1.display();
    }
}