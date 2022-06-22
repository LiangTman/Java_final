package Practice_5;

public class Manager {
    private String No;
    private String Name;
    private Double Salary;

    public Manager(String no, String name, Double salary) {
        No = no;
        Name = name;
        Salary = salary;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary+salary*0.25;
    }

    public Manager() {
    }

    public void intro(){
        System.out.println("经理号:"+getNo());
        System.out.println("经理姓名:"+getName());
    }

    public void showSalary(){
        System.out.println("薪资信息:"+getSalary());
    }

    public void work(){
        System.out.println("我是经理!");
    }
}
