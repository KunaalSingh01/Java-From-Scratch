
//Many forms

public class Polymorphism {
    public static void main(String args[]){
//overloading example:
        Calc nums=new Calc();
        System.out.println(nums.sum(1,2));
        System.out.println(nums.sum((float)1.5,(float)2.5));
        System.out.println(nums.sum(1,2,3));
//overriding example:
        Deer d=new Deer();
        d.eat();
    }
}



// Overloading for compile Time
class Calc{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum( float a, float b){
        return a+b;
    }
}

//Overriding run-Time
class Animal{
    void eat(){              //function eat() of  parent class
        System.out.println("can eat anything");
    }
}

class Deer extends Animal{
    void eat(){            //function eat() of child class
        System.out.println("only eats grass");
    }
}