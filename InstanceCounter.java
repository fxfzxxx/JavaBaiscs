public class InstanceCounter{
    // 私有类变量
    private static int numInstances = 0;
    // get 类方法访问类变量
    protected static int getCount(){
        return numInstances;
    }
    // 私有类方法 
    private static void addInstances(){
        numInstances++;
    }
    // 构造器
    InstanceCounter(){
        InstanceCounter.addInstances();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances.");

        // 500个实例, 每个实例创建的时候 构造器 会调用 get类方法 改变 类变量的值.
        for (int i = 0;i<500;i++){
            new InstanceCounter();
        }

        System.out.println("Created " + InstanceCounter.getCount() + " instances.");

    }
}