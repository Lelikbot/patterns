package kolokolov.creational.singletone.lazy.simple;

import kolokolov.creational.SimpleObject;

public class Main {

    public static void main(String[] args) {
        SingletonObject instance1 = SingletonObject.getInstance();
        SingletonObject instance2 = SingletonObject.getInstance();

        SimpleObject simpleObject1 = new SimpleObject();
        SimpleObject simpleObject2 = new SimpleObject();

        System.out.println("Instance equals? " + (instance1 == instance2));
        System.out.println("SimpleObject equals? " + (simpleObject1 == simpleObject2));
    }
}
