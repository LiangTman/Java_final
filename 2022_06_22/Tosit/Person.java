package Tosit;

public class Person {
    private String pName;

    public Person() {
    }

    public Person(String pName) {
        this.pName = pName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


    public void buyPro(Market m, Product p) {
        m.sell(p.getProName());
    }
}
