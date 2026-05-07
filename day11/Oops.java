
public class Oops {
    public static void main(String arg[]){
        Pen p1 =new Pen(); //created a pen object called p1.(Constructor)
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(2);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());


        //constructor 
        Student s1= new Student("kunal");
        System.out.println(s1.name);
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2= new Student(22);
        System.out.println(s2.age);
        Student s3= new Student();
        for(int i=0; i<=2; i++ ){
            System.out.println(s2.marks[i]);
        }
        

    }
}
class Pen{
    private String color;
    private int tip;
    //getter & setter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int tip){
        this.tip= tip;
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

    Student(Student s1){
        marks = new int[3];

        this.name=s1.name;
        this.age=s1.age;

    }

}

