public class MainForCat {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setName("chenny");
        c.color="Brown";
        c.cry();
        System.out.println(c.getName()+"'s color is "+ c.color);
        //System.out.println(c.name+"'s color is "+c.color);
    }
}
