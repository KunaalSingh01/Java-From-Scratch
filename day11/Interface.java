public class Interface {
    public static void main(String args[]){
        Queen q= new Queen();
        q.move();
        Omnivour crow= new Omnivour();
        crow.eatVeg();
        crow.eatNonVeg();
    }
}

//Using Interface for abstraction
interface chessMoves{
    void move();
}
class Queen implements chessMoves {
    public void move(){
        System.out.println("can move anywhere");
    };
}

class Rook implements chessMoves {
    public void move(){
        System.out.println("can move right or left any amount of steps");
    };
}

class Bishop implements chessMoves {
    public void move(){
        System.out.println("can move diagonal only");
    };
}

class Knight implements chessMoves {
    public void move(){
        System.out.println("can only move in L-shape 2+1");
    };
}

class King implements chessMoves {
    public void move(){
        System.out.println("can move 1 step anywhere");
    };
}


// Using Interface for Multiple-Inheritance

interface Herbivour{
    void eatVeg();
}
interface Carnivour{
    void eatNonVeg();
}

class Omnivour implements Herbivour, Carnivour{
    public void eatVeg(){
        System.out.println("eat veg true");
    };

    public void eatNonVeg(){
        System.out.println("eat Non-veg true");
    };

}