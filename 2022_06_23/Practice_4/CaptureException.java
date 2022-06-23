package Practice_4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CaptureException {
    public static void main(String[] args) {
        try {
            read("a.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void read(String path) throws FileNotFoundException,IOException {
        if(!path.equals("a.txt")){
            throw new FileNotFoundException("文件名错误");
        }else if(!path.equals("c.txt")){
            throw new IOException("打开文件错误");
        }
    }
}
