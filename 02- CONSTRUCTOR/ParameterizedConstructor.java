// PARAMETERIZED CONSTRUCTOR 

 class Student{
int number1;
int number2;
    Student(int a,int b){
        number1=a;
        number2=b;
    }
    void display(){
        System.out.println(number1+number2);
    }

}
class ParameterizedConstructor{
    public static void main(String[] args) {
        Student s1=new Student(4, 5);
        s1.display();

    }
}