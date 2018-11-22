package kolokolov.creational.singletone.lazy.threadesafe;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            synchronized (SingletonObject.class) {
                if (instance == null) {
                    instance = new SingletonObject();
                }
            }
        }
        return instance;
    }
}
