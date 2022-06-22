package Practice_4;

public class Card {
    private String color;
    private String  num;

    public Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public String getNum() {
        return num;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public void showCard(){
        System.out.println("这张牌是：" + getColor() + "," +getNum() );
    }
}
