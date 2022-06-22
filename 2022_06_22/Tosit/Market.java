package Tosit;

public class Market {
    private String marName;
    private Product[] pros;

    public Market() {
    }

    public Market(String marName, Product[] pros) {
        this.marName = marName;
        this.pros = pros;
        System.out.println("超市" + marName + "成立了");
    }

    public String getMarName() {
        return marName;
    }

    public void setMarName(String marName) {
        this.marName = marName;
    }

    public Product[] getPros() {
        return pros;
    }

    public void setPros(Product[] pros) {
        this.pros = pros;
    }


    public void sell(String sellpro) {

        Product p = null;
        for (int i = 0; i < pros.length; i++) {
            if (sellpro == pros[i].getProName()) {

                p = pros[i];
            }
        }

        if (p == null) {
            System.out.println(marName + "超市没有" + sellpro);
        } else {
            System.out.println("买到了" + p.getProName());
        }
    }
}
