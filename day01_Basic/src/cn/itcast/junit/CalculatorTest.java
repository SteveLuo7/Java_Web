package cn.itcast.junit;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        int add = c.add(1, 2);
        System.out.println(add);

        int sub = c.sub(1, 2);
        System.out.println(sub);

    }
}
