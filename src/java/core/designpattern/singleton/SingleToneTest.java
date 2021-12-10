package java.core.designpattern.singleton;

public class SingleToneTest {
    private static SingleToneTest instance;
    private String name;

    private SingleToneTest(String name) {
        this.name = name;
    }

    public static SingleToneTest getInstance(String name){
        if(instance == null){
            synchronized (SingleToneTest.class){
                if(instance == null){
                    instance = new SingleToneTest(name);
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleToneTest obj1 = SingleToneTest.getInstance("Kumar");
        System.out.println("first object address:"+obj1);

        SingleToneTest obj2 = SingleToneTest.getInstance("Anita");
        System.out.println("second object address:"+obj2);

    }
}
