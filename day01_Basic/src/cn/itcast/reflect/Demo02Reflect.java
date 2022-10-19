package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;

public class Demo02Reflect {
    public static void main(String[] args) throws Exception {

        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field a = personClass.getField("a");

        System.out.println("=========================");


        Person p = new Person();
        Object value =a.get(p);
        System.out.println(value);

        a.set(p,"zhangsan");
        System.out.println(p);

        System.out.println("=========================");

        Field[] declaredField = personClass.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
