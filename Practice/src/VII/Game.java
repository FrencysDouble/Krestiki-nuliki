package VII;

import java.util.Stack;

public class Game {
    int count = 0;
    int i = 0;

    public void CardGame(Stack<Integer> player1, Stack<Integer> player2) {
        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (player1.firstElement() > player2.firstElement()) {
                int temp = player2.firstElement();
                int temp2 = player1.firstElement();
                player1.remove(i);
                player2.remove(i);
                player1.addElement(temp2);
                player1.addElement(temp);
                count++;
            } else if (player1.firstElement() < player2.firstElement()) {
                int temp = player2.firstElement();
                int temp2 = player1.firstElement();
                player1.remove(i);
                player2.remove(i);
                player2.addElement(temp);
                player2.addElement(temp2);
                count++;
            } else if (player1.firstElement() == 9 && player2.firstElement() == 0) {
                int temp = player2.firstElement();
                int temp2 = player1.firstElement();
                player1.remove(i);
                player2.remove(i);
                player2.addElement(temp);
                player2.addElement(temp2);
                count++;
            } else if (player1.firstElement() == 0 && player2.firstElement() == 9) {
                int temp = player2.firstElement();
                int temp2 = player1.firstElement();
                player1.remove(i);
                player2.remove(i);
                player1.addElement(temp2);
                player1.addElement(temp);
                count++;
            }
        }
        EndGame(count,player1,player2);
    }

    public void EndGame(int count, Stack<Integer> player1, Stack<Integer> player2) {
        if (count == 106) {
            System.out.println("botva");
        } else if (player1.isEmpty()) {
            System.out.println("second" + " "+ count);
        } else if (player2.isEmpty()) {
            System.out.println(("first" +" "+ count));
        }
    }
}
