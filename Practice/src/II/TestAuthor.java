package II;

import java.util.Objects;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String name, email,gen;
        char gender = 'U';
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя, Email, Пол(male or female)");
        name = in.nextLine();
        email = in.nextLine();
        gen = in.nextLine();
        if(Objects.equals(gen, "male"))
        {
            gender = 'M';
        }
        else if(Objects.equals(gen, "female"))
        {
            gender = 'F';
        }
        Author b1 = new Author(name, email, gender);
        System.out.println(b1);
    }
}
