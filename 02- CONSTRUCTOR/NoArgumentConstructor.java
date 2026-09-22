

// NO ARGUMENT CONSTRUCTOR

// class Student{
// Student(){
// System.out.println("Student is called ");
// }
// }
// class NoArgumentConstructor{
// public static void main(String[] args) {
// Student s1=new Student();
// }
// }

//NO ARGUMENT CONSTRUCTOR WITH THE VARIABLES
class Student{
String name;
int age;
Student(){
name="Kirubhakaran";
age=25;
}
void display(){
System.out.println("Student Name : "+name);
System.out.println("Student Age : "+25);

}
}
class NoArgumentConstructor{
public static void main(String[] args) {
Student s1=new Student();
s1.display();
}
}
