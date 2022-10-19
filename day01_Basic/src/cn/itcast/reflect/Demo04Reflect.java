package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

public class Demo04Reflect {
    public static void main(String[] args) throws Exception {

        Class<Person> personClass = Person.class;
//        Method eat = personClass.getMethod("eat");
        Person p = new Person();
//        eat.invoke(p);



        Method eat2 = personClass.getMethod("eat",String.class);
        eat2.invoke(p,"rice");


    }


}
