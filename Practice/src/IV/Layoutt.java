package IV;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

class NullLayout extends JFrame {
    public int R = 0, A = 0;
    JButton but1 = new JButton("Real Madrid");
    JButton but2 = new JButton("AC Milan");
    Label labe1 = new Label("Winner: DRAW");
    JLabel jlabe1 = new JLabel("Last Scorer:");
    JLabel jlabe2 = new JLabel("Result: " + A + " X " + R);

    public NullLayout() {
        setLayout(null);
        but1.setBounds(350, 0, 150, 500);
        but2.setBounds(0, 0, 150, 500);
        labe1.setBounds(210, 0, 150, 20);
        jlabe1.setBounds(205, 300, 150, 100);
        jlabe2.setBounds(210, 200, 150, 100);
        add(but1);
        add(but2);
        add(labe1);
        add(jlabe1);
        add(jlabe2);
        setSize(500, 500);

        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                R++;
                jlabe2.setText("Result " + A + "X" + R);
                jlabe1.setText("Last Scorer: Real Madrid");
                if (A > R) {
                    labe1.setText("Winner: AC Milan");
                } else if (A < R) {
                    labe1.setText("Winner: Real Madrid");
                } else {
                    labe1.setText("Winner: DRAW");
                }
            }
        });

        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                A++;
                jlabe2.setText("Result " + A + "X" + R);
                jlabe1.setText("Last Scorer: AC Milan");
                if(A > R){
                    labe1.setText("Winner: AC Milan");
                }else if(A < R){
                    labe1.setText("Winner: Real Madrid");
                }else{
                    labe1.setText("Winner: DRAW");
                }
            }
        });
    }
}

