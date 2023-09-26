import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo18 {
    public static void main(String[] args) {
        writeFile1();
        writeFile2();
    }

    public static void writeFile2(){
        File file = new File("something-2.txt");
        try {
            file.createNewFile();
            try(var fos = new FileOutputStream(file);
                var bos = new BufferedOutputStream(fos)){
                String content = "This is about try with resource statement";
                bos.write(content.getBytes());
                System.out.println("File Saved!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile1(){
        File file = new File("something-1.txt");
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try {
                String content = "This is about try with resource statement";
                bos.write(content.getBytes());
                System.out.println("File Saved!");
            }finally {
                bos.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
