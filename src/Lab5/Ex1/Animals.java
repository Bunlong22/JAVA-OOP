package Lab5.Ex1;
// Write a java program to create classes like the following:
//a. Class Animal which has methods walk() and cry().
//b. Cass Cat inherited from class Animal then override method walk() and cry().
//c. Cass Dog inherited from class Animal then override method walk() and cry().
//d. Class Main contains main method then create Objects and call method cry and
//walk as following:
// Animal a1 = new Animal(); then call methods
// Animal a2 = new Cat(); then call methods
// Animal a3 = new Dog(); then call methods
// Cat c1 = new Cat(); then call methods
// Dog ad1= new Dog(); then call methods
 class Animals {
//    methods
     void Walk(){
        System.out.println("Walking on the road");
    }
     void Cry(){
        System.out.println("Crying on the road");
    }

}
class Cat extends Animals{
    @Override
    void Walk(){
        System.out.println("Cat Walking on the road");
    }
    void Cry(){
        System.out.println("Cat Crying on the road");
    }
}
class Dog extends Animals{
    @Override
    void Walk(){
        System.out.println("Dog Walking on the road");
    }
    void Cry(){
        System.out.println("Cat Crying on the road");
    }
}
class Main {
     public static void main(String[] args){
         Animals a1= new Animals();
         a1.Walk();
         a1.Cry();
         Animals a2= new Cat();
         a2.Cry();
         a2.Walk();
         Animals a3= new Dog();
         a3.Walk();
         a3.Cry();
         Cat c1 = new Cat();
         c1.Walk();
         c1.Cry();

         Dog d1 = new Dog();
         d1.Walk();
         d1.Cry();
     }
}

