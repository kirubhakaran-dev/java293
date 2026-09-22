// interface Camera {

//     void takePhoto();
// }

// interface MusicPlayer {

//     void playMusic();
// }

// class Smartphone implements Camera, MusicPlayer {

//     public void takePhoto() {
//         System.out.println("Taking photo");
//     }

//     public void playMusic() {
//         System.out.println("Playing music");
//     }
// }

// public class MultipleInheritance {

//     public static void main(String[] args) {

//         Smartphone s1 = new Smartphone();

//         s1.takePhoto();
//         s1.playMusic();
//     }
// }

//=---------------------------------------

// interface Printable {

//     void print();
// }

// interface Scannable {

//     void scan();
// }

// class Printer implements Printable, Scannable {

//     public void print() {
//         System.out.println("Printing document");
//     }

//     public void scan() {
//         System.out.println("Scanning document");
//     }
// }

// public class MultipleInheritance {

//     public static void main(String[] args) {

//         Printer p1 = new Printer();

//         p1.print();
//         p1.scan();
//     }
// }

//----------------------------------

interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}

class Duck implements Flyable, Swimmable {

    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Duck d1 = new Duck();

        d1.fly();
        d1.swim();
    }
}