class Animal {
    
    void name() {
        System.out.println("Animal");
    }
}

class Fish extends Animal{
    void name() {
        System.out.println("Fish");
    }

    void nameTest() {
        this.name(); //调用类内函数 输出Fish
        super.name(); //调用父函数 输出 Animal
    }
}

public class InheritTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name();
        Fish fish = new Fish();
        fish.name();
        fish.nameTest();
    }
    
}