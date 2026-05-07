
public class Constructor {
    public static void main(String arg[]){

        //constructor 
        Student s1= new Student();
        s1.name="kunal";
        s1.age=22;
        s1.pswd="123asd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2= new Student(s1);
        s2.pswd="321dsa";
        s1.marks[2]=100;
        for(int i=0; i<=2; i++ ){
            System.out.println(s2.marks[i]);
        }
        

    }
}

//Constructor


class Student{
    String name;
    int age;
    String pswd;
    int marks[];
    

    //using the same constructor with different parameters is know as {OVERLOADING}
    // no return type needed not even void
    Student(){
        marks = new int[3];
        System.out.println("this is non-parameterized constructor");
    }
    Student(String name){
        marks = new int[3];
        this.name=name;
    }

    Student(int age){
        marks = new int[3];
        this.age=age;
    }

    // Shallow Copy Constructor 
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name=s1.name;
    //     this.age=s1.age;
    //     this.marks=s1.marks;
    // }


    //Deep Copy Constructor
    Student(Student s1){
        marks = new int [3];
        this.name=s1.name;
        this.age=s1.age;
        for(int i=0 ; i <=2;i++){
            this.marks[i]=s1.marks[i];
        }
    }

}

