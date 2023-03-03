public class Cat {
    //a.Data member/ Field:
    private String name;
    public String color;
    //b. Method Member:
    public void setName(String name){

        this.name=name;
    }
    public String getName(){

        return name;
    }
    // Create the main method then instance object Cat then test it.
    public void cry(){
        System.out.println(name+" is crying Meow! Meow!");
    }
}
