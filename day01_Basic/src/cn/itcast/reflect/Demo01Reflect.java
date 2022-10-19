package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {

        Class<?> cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2 && cls2 == cls3);

        Class c = Student.class;
        System.out.println(c == cls1);


    }
}
