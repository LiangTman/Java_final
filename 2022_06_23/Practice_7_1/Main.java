package Practice_7_1;

public class Main {
    public static void main(String[] args) {
        ListCopy listCopy = new ListCopy(3);
        listCopy.add("hello");
        listCopy.add("hello1");
        listCopy.add("hello2");
        listCopy.add("hello4");
        boolean f=listCopy.remove(1);
        listCopy.show();
        boolean flag = listCopy.contain("hello1");
        System.out.println(flag);
        int size = listCopy.size();
        String s = (String) listCopy.get(3);
        System.out.println(s);
        System.out.println(size);
    }
}
