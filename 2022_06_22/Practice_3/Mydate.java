package Practice_3;

public class Mydate {
    private int year; //年
    private String month; //月
    private String day; //日

    public Mydate(int year,String month,String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void showDate(){
        System.out.println("现在的日期为：" + getYear() + "年" + getMonth() + "月" + getDay() + "日");
    }
    public void isBi(){
     if(getYear()%4 ==0 && !(getYear() % 100==0) || getYear()% 400 ==0){
         System.out.println("今年是闰年!");
     }else {
         System.out.println("今年不是闰年！");
     }
    }
}
