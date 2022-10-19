package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03Reflect {
    public static void main(String[] args) throws Exception{

        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //构造方法是用来创建对象的
        Person cristiano = constructor.newInstance("Cristiano", 37);
        System.out.println(cristiano);

        Person person = personClass.newInstance();
        System.out.println(person);

//        constructor.setAccessible(true);

    }
}
