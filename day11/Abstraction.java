public class Abstraction {
    public static void main(String args[]){
        Pug tommy= new Pug();
        tommy.walk();
        tommy.drink();
        tommy.eat();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eating");
    }

    abstract void walk();
    
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("walking");
    }

    void drink(){
        System.out.println("water");
    }

    Dog(){
        System.out.println("Dog constructor called");
    }
}

class Pug extends Dog {
    void size(){
        System.out.println("small animal");
    }

    Pug(){
        System.out.println("Pug constructor called");
    }
}
