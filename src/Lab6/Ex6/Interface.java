package Lab6.Ex6;

public class Interface {
    // Walkable interface
    interface Walkable {
        void walkLeft();

        void walkRight();

        void walkForward();

        void walkBackward();
    }

    // Human class implementing Walkable interface
    static class Human implements Walkable {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void walkLeft() {
            System.out.println(name + " is walking left.");
        }

        public void walkRight() {
            System.out.println(name + " is walking right.");
        }

        public void walkForward() {
            System.out.println(name + " is walking forward.");
        }

        public void walkBackward() {
            System.out.println(name + " is walking backward.");
        }
    }

    // Animal class implementing Walkable interface
    abstract static class Animal implements Walkable {
        protected int legs;

        public Animal(int legs) {
            this.legs = legs;
        }

        public abstract void eat();

        public void walkLeft() {
            System.out.println("The animal is walking left on " + legs + " legs.");
        }

        public void walkRight() {
            System.out.println("The animal is walking right on " + legs + " legs.");
        }

        public void walkForward() {
            System.out.println("The animal is walking forward on " + legs + " legs.");
        }

        public void walkBackward() {
            System.out.println("The animal is walking backward on " + legs + " legs.");
        }
    }

    // Cat class extending Animal class and implementing Pet interface
    static class Cat extends Animal implements Pet {
        private String name;

        public Cat(String name) {
            super(4);
            this.name = name;
        }

        public Cat() {
            this("");
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void play() {
            System.out.println(name + " is playing with a toy.");
        }

        public void eat() {
            System.out.println(name + " is eating cat food.");
        }
    }

    // Fish class extending Animal class
    static class Fish extends Animal {
        public Fish() {
            super(0);
        }

        public void eat() {
            System.out.println("The fish is eating fish food.");
        }

        public void walkLeft() {
            System.out.println("The fish is swimming left.");
        }

        public void walkRight() {
            System.out.println("The fish is swimming right.");
        }

        public void walkForward() {
            System.out.println("The fish is swimming forward.");
        }

        public void walkBackward() {
            System.out.println("The fish is swimming backward.");
        }
    }

    // Pet interface
    interface Pet {
        void setName(String name);

        String getName();

        void play();
    }

    // Main class to test the program
    public class Main {
        public static void main(String[] args) {
            Walkable[] walkables = new Walkable[4];
            walkables[0] = new Human("John", 30);
            walkables[1] = new Cat("Fluffy");
            walkables[2] = new Fish();
            walkables[3] = new Animal(6) {
                public void eat() {
                    System.out.println("This animal is eating some food.");
                }
            };

            for (Walkable w : walkables) {
                w.walkLeft();
                w.walkRight();
                w.walkForward();
                w.walkBackward();


            }
        }
    }
}
