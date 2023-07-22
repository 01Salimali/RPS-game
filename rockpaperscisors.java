package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class rockpaperscisors {
    private JButton enterButton;
    private JTextField player;
    private JTextField result;
    private JTextField cominput;
    private JPanel rockpaper;
    private JButton Enter;
    private JLabel comptext;
    private JLabel playertext;


    public  rockpaperscisors(){



        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int myno = Integer.parseInt(player.getText());
                int comp = (int) (Math.random() * 3);

                if (comp == 0){
                    cominput.setText("Rock");
                } else if (comp == 1) {
                    cominput.setText("Paper");
                }
                else if (comp == 2) {
                    cominput.setText("Scissor");
                }

                switch (myno){
                    case 0: player.setText("Rock");
                    break;
                    case 1: player.setText("paper");
                    break;
                    case 2: player.setText("Scissor");
                }
                if (comp == 0 && myno == 1 || comp ==1 && myno == 2 || comp == 2 && myno == 0){
                    result.setText("You Are The Winner!");
                } else if (comp == myno) {
                    result.setText("It's a Draw!");
                }
                else {
                    result.setText("Computer Wins!");
                }

    }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("rockpaper");
        frame.setContentPane(new rockpaperscisors().rockpaper);
        frame.setSize(550,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
