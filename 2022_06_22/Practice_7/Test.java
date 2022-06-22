package Practice_7;


public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("1001", "图书1", "2666412", 25.8, "2022-05-12");
        Book book2 = new Book("1002", "图书2", "2666412", 21.8, "2022-05-12");
        Book book3 = new Book("1003", "图书3", "2666412", 22.8, "2022-05-12");
        MaxPrice(book1.getBook_Price(),book2.getBook_Price(),book3.getBook_Price());
    }

    public static void MaxPrice(double book1, double book2, double book3) {
        double MAX = book1;
        if (MAX > book2 && MAX > book3) {
            System.out.println("最大值为book1:"+book1);
        }
        if (MAX <book2){
            MAX = book2;
            if(MAX<book3){
                System.out.println("最大值为book3:"+book3);
            }else{
                System.out.println("最大值为book2:"+book2);
            }
        }
    }
}
