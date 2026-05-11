// Static and Super  Keywords in JAVA...........

public class StaticSuper {

    static int a=2;
    static int b;

    static{
        System.out.println("static block");
        b=a*2;
    }
    public static void  main(String args[]){
        Students s1=new Students();
        s1.name="kunal";
        System.out.println(s1.name);
        s1.schoolName="Apj";
        System.out.println(s1.schoolName);

        Students s2= new Students();
        System.out.println(s2.name);
        System.out.println(s2.schoolName);



        System.out.println("value of a= " + a);
        System.out.println("value of b= " + b);

        //Super keyword
        Dog tommy= new Dog();
        System.out.println(tommy.color);

    }
}

class Students{
    String name;
    int rollNo;

    static String schoolName; 

    Students(){
        this.name=name;
        this.rollNo=rollNo;
    }
}



//Super Keyword
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal{
    Dog(){
        super.color="black";
        //super();     // called by default no need to add specially
        System.out.println("Dog Constructor");
    }
}