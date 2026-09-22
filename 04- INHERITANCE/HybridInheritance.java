class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog can bark");
    }
}

interface Pet {

    void play();
}

class Puppy extends Dog implements Pet {

    public void play() {
        System.out.println("Puppy can play");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();
        p1.bark();
        p1.play();
    }
}