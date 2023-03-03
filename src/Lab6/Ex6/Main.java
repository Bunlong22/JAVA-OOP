package Lab6.Ex6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Animal animal =new Animal();

         human.walkLeft();
         human.walkRight();
         human.walkForward();
         human.walkBackward();
        System.out.println("---------------------------------");

        animal.walkLeft();
        animal.walkRight();
        animal.walkForward();
        animal.walkBackward();
    }
}
