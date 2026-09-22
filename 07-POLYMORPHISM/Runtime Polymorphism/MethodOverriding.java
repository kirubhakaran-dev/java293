// package 07-POLYMORPHISM.Runtime Polymorphism;

// public class MethodOverriding {
    
// }
// class Vehicle {

//     void move() {
//         System.out.println("Vehicle is moving");
//     }
// }

// class Car extends Vehicle {

//     @Override
//     void move() {
//         System.out.println("Car is driving");
//     }
// }

// public class MethodOverriding {

//     public static void main(String[] args) {

//         Vehicle v1 = new Car();

//         v1.move();
//     }
// }

//---------------------------------

class Payment {

    void pay() {
        System.out.println("Making payment");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Payment p1 = new UPI();

        p1.pay();
    }
}