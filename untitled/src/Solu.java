import java.util.Scanner;

import java.util.Scanner;

/*
Максимум из введенных чисел
*/

public class Solu {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        int number = console.nextInt();
        int count = 0;
        if(number == 5 | number == 0)
        {
            System.out.println(a);
        }
        else
        {
            do
            {
                System.out.println(a);
                count++;
            }
            while(count<number);
            {
            }
        }
    }
}