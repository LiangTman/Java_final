package Practice_6;

/**
 * 定义一个猫 Cat类。
 * <p>
 * 属性：年龄 int类型，颜色char类型
 * <p>
 * 构造方法：无参构造方法，满参构造方法
 * <p>
 * 成员方法：get/set 方法、showMsg 方法：打印猫的属性信息
 * <p>
 * 定义测试类，main 方法中，使用满参构造方法，创建Cat对象。
 * <p>
 * 测试类中，定义比较方法，判断两只猫属性是否完全一样。属性完全相同返回 true，一旦不同则返回false。
 */

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10, "绿色");
        Cat cat2 = new Cat(10, "绿色");
        cat1.showMsg();
        cat2.showMsg();
        if (isOneCat(cat1, cat2)) {
            System.out.println("是同一只猫");
        } else {
            System.out.println("不是同一只猫");
        }
    }

    public static boolean isOneCat(Cat cat1, Cat cat2) {
        if (cat1.getAge() == cat2.getAge() && cat1.getColor().equals(cat2.getColor())) {
            return true;
        } else {
            return false;
        }
    }
}


