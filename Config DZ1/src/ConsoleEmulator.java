
import java.io.*;
import java.util.zip.*;
import java.util.Enumeration;
import java.lang.String;
import java.util.Scanner;

public class ConsoleEmulator {
    {
        public static String actual_directory = "FileMain/";
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)throws Exception {
        ZipFile f = new ZipFile("../FileMain.zip");
        boolean b = false;
        while (!b) {
            b = using(f);
        }


    }

        public static void tutorial () {
        System.out.println(
                "CLI works perfect:\n" +
                        "    help - print this information\n" +
                        "    exit - exit CLI\n" +
                        "    pwd - print working directory\n" +
                        "    ls - list computer files \n" +
                        "    cd way - change directory\n");
    }

        public static void ls (ZipFile file) throws IOException
        {
            String name = "/";
            for (Enumeration<? extends ZipEntry> use = file.entries(); use.hasMoreElements(); ) {
                ZipEntry fileInput = use.nextElement();
                String tempVar = fileInput.getName();
                if (!tempVar.startsWith(name) && tempVar.startsWith(actual_directory) && !tempVar.equals(actual_directory)) {
                    name = tempVar;
                    if (fileInput.isDirectory()) {
                        tempVar = tempVar.substring(0, tempVar.lastIndexOf('/'));
                    }
                    System.out.print(tempVar.substring(tempVar.lastIndexOf('/')));
                }

            }
        }

        public static void cd (ZipFile file)
        {
            String getLine = actual_directory + scanner.nextLine();
            if (file.getEntry(getLine) != null) {
                ZipEntry zipEntry = file.getEntry(getLine);
                if (zipEntry.isDirectory()) {
                    actual_directory = zipEntry.getName();
                }
            }

        }

        public static void cat (ZipFile file) throws IOException {

        String getLine = actual_directory + scanner.nextLine();
        if (file.getEntry(getLine) != null) {
            ZipEntry nameFile = file.getEntry(getLine);
            if (!nameFile.isDirectory()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.getInputStream(nameFile)));
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    System.out.println(s);
                }
            }
        }

    }

        public static boolean using (ZipFile file) throws IOException
        {
            Scanner usert_in = scanner;
            String imput = usert_in.nextLine();
            int imput_size = imput.length();

            if (imput_size == 0) {
                return true;
            }
            switch (imput) {
                case "help":
                    tutorial();
                    break;
                case "exit":
                    return true;
                case "pwd":
                    System.out.println(actual_directory);
                    break;
                case "ls":
                    (file);
                    break;
                case "cd":
                    cd(file);
                    break;
                case "cat":
                    cat(file);
                    break;
            }
            return false;
        }
    }
}