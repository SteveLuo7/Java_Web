package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class CalculatorTest {
    //初始化方法 用于资源申请
    @Before
    public void init() {
        System.out.println("init...");

    }

    @After
    public void close() {
        System.out.println("close....");

    }
    @Test
    public void testAdd() {
        System.out.println("testAdd....");
//        System.out.println("我被执行了");
        Calculator c = new Calculator();
        int result = c.add(45, 67);
//        System.out.println(result);

        Assert.assertEquals(112,result);

    }

    @Test
    public void testSub() {

        Calculator c = new Calculator();
        int result = c.sub(140, 90);

        System.out.println("testSub.....");
        System.out.println(result);
        Assert.assertEquals(40,result);
    }

}
