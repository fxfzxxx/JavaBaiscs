
/**建立一个公共动物父类*/
class Animals {
    private String name;
    private int id;
    /*由于name和id都是私有的，所以子类不能直接继承，
    需要通过有参构造函数进行继承*/
    Animals(String myname,int myid) {
        name = myname;
        id = myid;
    }
    void eat() {
        System.out.println(name+"正在吃");
    }
    void sleep() {
        System.out.println(name+"正在睡");
    }
    void introduction() {
        System.out.println("大家好！我是"  +id+"号"+name +".");
    }

}

//子类 Penguin 需要通过关键字 super 进行声明

public class InheritConstructorPrivate extends Animals {
    public InheritConstructorPrivate(String myname,int myid) {
        super(myname,myid); // 声明继承父类中的两个属性
    }

    public static void main(String[] args) {
        InheritConstructorPrivate a = new InheritConstructorPrivate("Sam",12345);
        a.eat();
        a.introduction();

    }
}