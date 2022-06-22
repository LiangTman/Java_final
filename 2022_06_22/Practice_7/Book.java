package Practice_7;

/**
 * 属性：图书编号，图书， ISBN编码，价格，出版日期
 *
 * 构造方法：无参构造方法，满参构造方法
 *
 * 成员方法：get/set 方法、showBook 方法，输出图书信息
 *
 * 定义测试类，使用满参构造方法，创建三个 Book对象，判断价格最贵的图书，并输出图书信息。
 */
public class Book {
    private String Book_NO;
    private String Book_Name;
    private String ISBN_NO;
    private double Book_Price;
    private String Book_Publish;

    public Book() {
    }

    public Book(String book_NO, String book_Name, String ISBN_NO, double book_Price, String book_Publish) {
        Book_NO = book_NO;
        Book_Name = book_Name;
        this.ISBN_NO = ISBN_NO;
        Book_Price = book_Price;
        Book_Publish = book_Publish;
    }

    public String getBook_NO() {
        return Book_NO;
    }

    public void setBook_NO(String book_NO) {
        Book_NO = book_NO;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getISBN_NO() {
        return ISBN_NO;
    }

    public void setISBN_NO(String ISBN_NO) {
        this.ISBN_NO = ISBN_NO;
    }

    public double getBook_Price() {
        return Book_Price;
    }

    public void setBook_Price(double book_Price) {
        Book_Price = book_Price;
    }

    public String getBook_Publish() {
        return Book_Publish;
    }

    public void setBook_Publish(String book_Publish) {
        Book_Publish = book_Publish;
    }
    
    public void showBook(){
        System.out.println("图书编号:"+getBook_NO());
        System.out.println("图书名称:"+getBook_Name());
        System.out.println("ISBN编号:"+getISBN_NO());
        System.out.println("图书价格:"+getBook_Price());
        System.out.println("出版日期:"+getBook_Publish());
    }
}
