// class Vehicle {

//     void start() {
//         System.out.println("Vehicle starts");
//     }
// }

// class Car extends Vehicle {

//     void drive() {
//         System.out.println("Car is driving");
//     }
// }

// class Bike extends Vehicle {

//     void ride() {
//         System.out.println("Bike is riding");
//     }
// }

// public class HierarchicalInheritance {

//     public static void main(String[] args) {

//         Car c1 = new Car();
//         c1.start();
//         c1.drive();

//         Bike b1 = new Bike();
//         b1.start();
//         b1.ride();
//     }
// }

//--------------------------------

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println("Developer is coding");
    }
}

class Designer extends Employee {

    void design() {
        System.out.println("Designer is designing");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Developer d1 = new Developer();
        d1.work();
        d1.code();

        Designer d2 = new Designer();
        d2.work();
        d2.design();
    }
}