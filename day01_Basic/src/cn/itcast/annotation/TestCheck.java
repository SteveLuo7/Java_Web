package cn.itcast.annotation;

import cn.itcast.junit.Calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * 简单的测试框架
 * 当主方法执行后，会自动检测添加check注解的所有方法，判断是否异常，记录到文件当中
 * 
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {

        Calculator c = new Calculator();
        //获取字节码文件对象
        Class cls = c.getClass();

        //获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));


        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number ++;

                    bw.write(method.getName() +"出现异常了");
                    bw.newLine();
                    bw.write("异常的名称： " + e.getCause().getClass().getSimpleName() );
                    bw.newLine();
                    bw.write("异常的原因： " + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------");
                }
            }
        }

        bw.write("本次测试一共出现 " + number  +"异常");

        bw.flush();
        bw.close();

    }
}
