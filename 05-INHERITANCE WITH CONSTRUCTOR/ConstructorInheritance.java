// class Parent {

//     Parent() {
//         System.out.println("Parent Constructor");
//     }
// }

// class Child extends Parent {

//     Child() {
//         System.out.println("Child Constructor");
//     }
// }

// public class ConstructorInheritance {

//     public static void main(String[] args) {

//         Child c1 = new Child();
//     }
// }

// WITH PARAMETERS

class BankAccount {

    BankAccount(double balance) {
        System.out.println("Initial Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount() {
        super(50000);
        System.out.println("Savings Account Created");
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();
    }
}