


// CONSTRUCTOR OVERLOADING 

class Student{
    String name;
    int age;
    Student(){
        name="kirubha";
        age=25;

    }
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
    Student(String name){
        this.name=name;
        age=24;

    }
    void display(){
        System.out.println(name+" "+age );
    }
}
class Main{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s2=new Student("karan", 28);
        s2.display();
        Student s3=new Student("Ragu");
        s3.display();



    }
}