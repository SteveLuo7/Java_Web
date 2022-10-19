package cn.itcast.proxy;

public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了" +money + "元买了台电脑");
        return "LENOVO电脑";
    }

    @Override
    public void show() {
        System.out.println("show Computer....");
    }
}
