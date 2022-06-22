package study;

public class Test {
    public static void main(String[] args) {
        FirstInterface first = new FirstImpl();
        first.study();
        first.study("hy");
        first.study("yl","hy");
    }
}
