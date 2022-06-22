package Practice_5;

import javax.sound.midi.Soundbank;

public class Coder {
    private String No;
    private String Name;
    private Double Salary;

    public Coder() {
    }

    public Coder(String no, String name, Double salary) {
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
        Salary = salary;
    }

    public void intro(){
        System.out.println("员工号:"+getNo());
        System.out.println("员工姓名:"+getName());
    }

    public void showSalary(){
        System.out.println("薪资信息:"+getSalary());
    }

    public void work(){
        System.out.println("我是程序员!");
    }
}
