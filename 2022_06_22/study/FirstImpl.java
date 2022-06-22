package study;

public class FirstImpl implements FirstInterface{
    @Override
    public void study() {
        System.out.println("I am studying");
    }

    @Override
    public void study(String address) {
        System.out.println("I live in "+ address);
    }

    @Override
    public void study(String student, String address) {
        System.out.println("I am "+student+"i live in "+ address);

    }
}
