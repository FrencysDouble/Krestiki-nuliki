package VII;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> player1 = new Stack<>();
        System.out.println("Введите числа для Первого игрока");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            int number = sc.nextInt();
            player1.push(number);
        }
        Stack<Integer> player2 = new Stack<>();
        System.out.println("Введите числа для Второго игрока");
        for(int i = 0; i < 5; i++)
        {
            int number = sc.nextInt();
            player2.push(number);
        }
        Game obj = new Game();
        obj.CardGame(player1,player2);
        System.out.println(player1);
        System.out.println(player2);
    }
}
