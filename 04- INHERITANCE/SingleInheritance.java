
// class Person {

//     void walk() {
//         System.out.println("Person can walk");
//     }
// }

// class Student extends Person {

//     void study() {
//         System.out.println("Student can study");
//     }
// }

// public class SingleInheritance {

//     public static void main(String[] args) {

//         Student s1 = new Student();

//         s1.walk();
//         s1.study();
//     }
// }

//---------------------------------------------------------------

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();   
        d1.bark();  
    }
}