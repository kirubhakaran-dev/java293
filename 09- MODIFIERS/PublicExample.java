class Student {

    public String name = "Kirubha";

    public void display() {
        System.out.println(name);
    }
}

public class PublicExample {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
        s1.display();
    }
}