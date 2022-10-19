package cn.itcast.annotation;

import cn.itcast.domain.Student;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 *
 *
 *
 */
@Pro(className = "cn.itcast.annotation.Demo1", methodName = "show")
public class Demo05ReflectTest {
    public static void main(String[] args) throws Exception {


        Class<Demo05ReflectTest> reflectTestClass = Demo05ReflectTest.class;
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();

        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
