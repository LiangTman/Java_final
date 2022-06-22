package Tosit;

public class Test {
    public static void main(String[] args) {

        Product p1 = new Product("苹果");
        Product p2 = new Product("香蕉");
        Product p3 = new Product("栗子");
        Product p4 = new Product("火龙果");
        Product p5 = new Product("橘子");

        Product[] pros = {p1, p2, p3, p4, p5};

        Market m = new Market("嘉年华", pros);
        Market m2 = new Market("红旗", new Product[]{p1});

        Person p = new Person("张三");

        Product buyp1 = new Product("苹果");
        Product buyp2 = new Product("烤鸭");

        p.buyPro(m2, buyp1);
        p.buyPro(m2, buyp2);

    }
}
