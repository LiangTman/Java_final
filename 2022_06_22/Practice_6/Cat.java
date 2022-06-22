package Practice_6;

public class Cat {
    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showMsg(){
        System.out.println("猫的年龄为:"+getAge()+" 猫的颜色为:"+getColor());
    }
}
