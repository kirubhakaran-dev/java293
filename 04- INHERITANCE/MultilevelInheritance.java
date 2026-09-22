// class Animal {

//     void eat() {
//         System.out.println("Animal can eat");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Dog can bark");
//     }
// }

// class Puppy extends Dog {

//     void play() {
//         System.out.println("Puppy can play");
//     }
// }

// public class MultilevelInheritance {

//     public static void main(String[] args) {

//         Puppy p1 = new Puppy();

//         p1.eat();
//         p1.bark();
//         p1.play();
//     }
// }

//---------------------------------------------------


class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {

    void turbo() {
        System.out.println("Sports car has turbo");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        SportsCar s1 = new SportsCar();

        s1.start();
        s1.drive();
        s1.turbo();
    }
}