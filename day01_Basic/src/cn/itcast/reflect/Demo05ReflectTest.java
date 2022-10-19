package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo05ReflectTest {
    public static void main(String[] args) throws Exception {

//        Person p = new Person();
//        p.eat("rice");
        Student stu = new Student();
        stu.sleep();

        System.out.println("======================");


        Properties pro = new Properties();
        ClassLoader classLoader = Demo05ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
