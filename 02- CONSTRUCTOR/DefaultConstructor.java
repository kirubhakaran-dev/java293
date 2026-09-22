//DEFAULT CONSTRUCTOR
// class Student{
//     String name;
//     int age;

// }
// class defaultConstructor{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         System.out.println(s1.name+" "+s1.age);
//     }
// }

//DEFAULT CONSTRUCTOR WITH VALUE DECLARATION 

class Student {
    String name;
    int age;
    String course;
}

class DefaultConstructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kirubhakaran";
        s1.age = 25;
        s1.course = "Java Fullstack Development";
        System.out.println("Student Name : " + s1.name);
        System.out.println("Student age : " + s1.age);
        System.out.println("Student course : " + s1.course);

    }

}