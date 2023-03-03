package Lab6.Ex6;

public class Animal implements Walkable{
    @Override
    public void walkLeft() {
        System.out.println("The animal is walking left!");
    }

    @Override
    public void walkRight() {
        System.out.println("The animal is walking right!");
    }

    @Override
    public void walkForward() {
        System.out.println("The animal is walking forward!");
    }

    @Override
    public void walkBackward() {
        System.out.println("The animal is walking backward!");
    }
}
