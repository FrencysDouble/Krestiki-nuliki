package VIII;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        File read = new File("out.txt");
        BufferedReader in = new BufferedReader(new FileReader(read));
        System.out.println("Сейчас в файле написано:" + in.readLine());
    }
}
