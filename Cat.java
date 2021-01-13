public class Cat {
    int catAge;
    public Cat(String name){
        System.out.println("The cat name is " + name);
    }

    public void setAge(int age){
        catAge = age;
    }

    public int getAge(){
        System.out.println("The cat age is" + catAge);
        return catAge;
    }

    public static void main(String[] args){
        Cat myCat = new Cat("Sam");
        myCat.setAge(2);
        myCat.getAge();
        System.out.println("The cat age is " + myCat.catAge);
    }
}
