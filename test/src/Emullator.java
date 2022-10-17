import java.io.*;
import java.util.zip.*;
import java.util.Enumeration;
import java.lang.String;
import java.util.Scanner;

public class Emullator
{
    public static String current_directory = "FileS/";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ZipFile zf = new ZipFile("../FileS.zip");
        System.out.println("\nThe default interactive shell is now myCLI\n");
        boolean clouse = false;
        while (!clouse) {clouse=work(zf);}



    }

    public static void help(){
        System.out.println(
                "I am myCLI. I can run next commands:\n" +
                        "    help - print this information\n" +
                        "    exit - exit myCLI\n" +
                        "    pwd - print working directory\n" +
                        "    ls - list computer files in working directory\n" +
                        "    cd WAY1 - change directory\n" +
                        "    cat WAY2 - concatenate");
    }

    public static void  ls(ZipFile zipFile) throws IOException
    {
        String entryName = "/";
        for (Enumeration<? extends ZipEntry> iter = zipFile.entries(); iter.hasMoreElements();)
        {
            ZipEntry zipEntry = iter.nextElement();
            String tmpName = zipEntry.getName();
            if (!tmpName.startsWith(entryName) && tmpName.startsWith(current_directory) && !tmpName.equals(current_directory))
            {
                entryName=tmpName;
                if (zipEntry.isDirectory())
                {
                    tmpName=tmpName.substring(0,tmpName.lastIndexOf('/'));
                }
                System.out.println(tmpName.substring(tmpName.lastIndexOf('/')));
            }

        }
    }

    public static void  cd(ZipFile zipFile)
    {
        String gotenLine = current_directory + scanner.nextLine();
        if (zipFile.getEntry(gotenLine)!=null)
        {
            ZipEntry zipEntry = zipFile.getEntry(gotenLine);
            if (zipEntry.isDirectory()){current_directory = zipEntry.getName();}
        }

    }

    public static void  cat(ZipFile zipFile) throws IOException {

        String gotenLine = current_directory + scanner.nextLine();
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

    public static  boolean work(ZipFile zipFile) throws IOException
    {
        Scanner usert_in = scanner;
        String imput = usert_in.nextLine();
        int imput_size = imput.length();

        if (imput_size == 0) {return true;}
        switch (imput) {
            case "clear":
                CLS();
            case "help":
                help();
                break;
            case "exit":
                return true;
            case "pwd":
                System.out.println(current_directory);
                break;
            case "ls":
                ls(zipFile);
                break;
            case "cd":
                cd(zipFile);
                break;
            case "cat":
                cat(zipFile);
                break;
            default:
                System.out.println("Данные введены неправильно");
                break;
        }
        return false;
    }
}