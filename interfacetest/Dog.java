package interfacetest;

public class Dog implements DogInterface{

    public String name;

    // public Dog(String name){
    //     this.name = name;
    // }
    public void eat() {
        System.out.println("Eating");
    }
    public void run() {
        System.out.println("Running");

    }

    public static void main(String[] args) {
        // Dog Sam = new Dog(Sam);
        Dog sam = new Dog();
        sam.eat();
    }
}