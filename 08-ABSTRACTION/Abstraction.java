// abstract class Animal {

//     abstract void sound();
// }

// class Dog extends Animal {

//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Abstraction {

//     public static void main(String[] args) {

//         Dog d1 = new Dog();

//         d1.sound();
//     }
// }


//----------------------------

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.draw();
    }
}