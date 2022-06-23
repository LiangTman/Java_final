package Practice_7_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        initsong();
        mainScreen();
    }

    private static void mainScreen() {
        System.out.println("=======欢迎来到tosiKTV========");
        System.out.println("1.查看列表");
        System.out.println("2.置顶歌曲");
        System.out.println("3.移到上一首");
        System.out.println("4.移除歌曲");
        System.out.println("5.添加歌曲");
        System.out.println("0.退出系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入您的操作:");
        int i = scanner.nextInt();
        switch (i) {
            case 0:
                loginout();
                break;
            case 1:
                show();
                break;
            case 2:
                totop();
                break;
            case 3:
                up();
                break;
            case 4:
                delete();
                break;
            case 5:
                addsong();
                break;
        }
    }

    private static void initsong() {
        list.add("两只老虎");
        list.add("光辉岁月");
        list.add("长城");
        list.add("心太软");
        mainScreen();
    }

    private static void delete() {
        System.out.println("输入要删除的歌曲:");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        list.remove(song);
        mainScreen();
    }

    private static void up() {
        System.out.println("输入要移动的歌曲:");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        int i = list.indexOf(song.trim());
        if (i < 0) {
            System.out.println("所移动歌曲不存在");
        } else if (i == 0) {
            System.out.println("歌曲已经在顶部！");
        } else {
            list.remove(song.trim());
            list.add(i - 1, song);
            show();
        }
        mainScreen();
    }

    private static void totop() {
        System.out.println("输入置顶歌曲:");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        list.remove(song.trim());
        list.add(0, song);
        show();
        mainScreen();
    }

    private static void show() {
        System.out.println(list);
        mainScreen();
    }

    private static void addsong() {
        System.out.println("输入添加歌曲:");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        list.add(song.trim());
        mainScreen();
    }

    private static void loginout() {
        System.out.println("系统退出");
        System.exit(0);
    }
}
