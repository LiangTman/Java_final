package Practice_5;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("2019110745","yl",5000.0);
        Coder coder = new Coder("2019110746","yss",6000.0);
        System.out.println("===============程序员================");
        coder.intro();
        coder.showSalary();
        coder.work();
        System.out.println("===============经理================");
        manager.intro();
        manager.showSalary();
        manager.work();
    }
}
