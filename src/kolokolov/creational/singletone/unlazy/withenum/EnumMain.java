package kolokolov.creational.singletone.unlazy.withenum;

import java.util.List;


public class EnumMain {

    public static void main(String[] args) {

        //Получаем первый объект и второй объект. Сравниваем значения по ссылке
        SingletonObject instance1 = SingletonObject.INSTANCE;
        SingletonObject instance2 = SingletonObject.INSTANCE;
        System.out.println("Equals for instance: " + (instance1 == instance2));

        //Извлекаем значения полей из первого и второго объекта - сравниваем по ссылке
        List<String> customCollection = instance1.getCustomCollection();
        List<String> customCollection1 = instance2.getCustomCollection();
        System.out.println("fields equals: " + (customCollection == customCollection1));
    }
}
