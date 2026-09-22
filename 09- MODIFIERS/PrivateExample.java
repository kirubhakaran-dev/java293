class Student {

    private int age = 25;

    void display() {
        System.out.println(age);
    }
}

public class PrivateExample {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}