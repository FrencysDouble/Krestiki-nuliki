package V;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Image extends JFrame {
    public String c;

    public Image() {
        this.c = c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название файла и расширение");
        c = scan.nextLine();
        System.out.println(c);
        this.getContentPane().setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Billy Harrington");
        ImageIcon icon = new ImageIcon(getClass().getResource(c));
        JLabel label2 = new JLabel(icon);
        add(label1);
        add(label2);
    }

    private static void createAndShowGUI() {

        JFrame frame = new Image();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}