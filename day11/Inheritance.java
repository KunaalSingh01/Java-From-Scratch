public class Inheritance {
    
    public static void main(String args[]){

        Fish shark= new Fish();
        shark.eat();

        Dog tommy=new Dog();
        tommy.breath();
        tommy.legs=4;
        tommy.breed="poodle";
        System.out.println(tommy.legs +"  "+ tommy.breed);

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}
//  Single level Inheritance
class Fish extends Animal{
    void fins(){
        System.out.println("there are fins");
    }
}


//Multi-level Inheritence
class Mammal extends Animal{    // child of animal
    int legs;
}
class Dog extends Mammal{    // child of mammal grandchild of animal 
    String breed;
}


// Hierarchial Inheritance:

class LandAnimal extends Animal{
    void walk(){
        System.out.println("we walk");
    }
}
class WaterAnimal extends Animal{
    void swim(){
        System.out.println("We swim");
    }
}
class SkyAnimal extends Animal{
    void Fly (){
        System.out.println("we fly");
    }
}