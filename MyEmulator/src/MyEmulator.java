import java.io.*;
import java.util.zip.*;
import java.lang.String;
import java.util.Scanner;


public class MyEmulator {
    public static String actual_directory = "FileMain/";
    public static Scanner scanner = new Scanner(System.in);
    public static String  name;
    public static boolean b = true;
    public static ZipEntry entry;


    public static void main(String[] args) throws Exception {
        ZipInputStream zin = new ZipInputStream(new FileInputStream("FileMain.zip/"));
        ZipFile File = new ZipFile("FileMain.zip/");
        while (b != false) {
            using(zin,File);
        }
    }


    public static void help() {
        System.out.println(
                "CLI works perfect:\n" +
                        "    help - print this information\n" +
                        "    exit - exit CLI\n" +
                        "    pwd - print working directory\n" +
                        "    ls - list computer files \n" +
                        "    cd way - change directory\n");
    }


    public static void cat(ZipFile zipFile) throws IOException {
        String gotenLine = actual_directory + scanner.nextLine();
        if (zipFile.getEntry(gotenLine)!=null)
        {
            ZipEntry zipEntry = zipFile.getEntry(gotenLine);
            if (!zipEntry.isDirectory())
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
                String line;
                while ((line = bufferedReader.readLine())!= null){System.out.println(line);}
            }
        }

    }

    public static void ls(ZipInputStream zin) throws IOException {
        long size;
        while ((entry = zin.getNextEntry()) != null) {
            name = entry.getName();
            size = entry.getSize();
            System.out.println(name + " " + size + "КБ");
        }
    }

    public static void cd(ZipFile zipFile) throws IOException {
        String getLine = actual_directory + scanner.nextLine();
        if (zipFile.getEntry(getLine) != null) {
            ZipEntry zipEntry = zipFile.getEntry(getLine);
            if (zipEntry.isDirectory()) {
                actual_directory = zipEntry.getName();
            }
        }
    }

    public static void using(ZipInputStream zin,ZipFile file) throws  IOException {
        Scanner user_in = scanner;
        String input = user_in.nextLine();
        int input_size = input.length();
        if (input_size == 0) {
            b = true;
        }
        else
        {
            switch (input) {
                case "help":
                    help();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "pwd":
                    System.out.println(actual_directory);
                    break;
                case "ls":
                    ls(zin);
                    break;
                case "cd":
                    cd(file);
                    break;
                case "cat":
                    cat(file);
                    break;
            }
        }
    }
}