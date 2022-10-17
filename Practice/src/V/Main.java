package V;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа для заполнения массива");
        Scanner sc = new Scanner(System.in);
        int Array[];
        Array = new int[10];
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            Array[i] = number;
        }
        Task obj = new Task();
        obj.recursion(Array);
    }
}
