package Practice_2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowDemo2 {
    public static void main(String[] args) throws IOException {
        read("b.txt");
    }
    public static void read(String path) throws FileNotFoundException,IOException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")) {
            throw new IOException();
        }
    }
}

