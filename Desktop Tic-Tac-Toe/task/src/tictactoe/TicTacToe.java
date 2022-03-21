package tictactoe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setTitle("Calculator");
        init();

        setVisible(true);
        setLayout(null);
    }

    public void init(){
        JPanel board = new JPanel(new GridLayout(3,3));



        JButton buttonA3 = new JButton("A3");
        buttonA3.setName("ButtonA3");
        board.add(buttonA3);

        JButton buttonB3 = new JButton("B3");
        buttonB3.setName("ButtonB3");
        board.add(buttonB3);

        JButton buttonC3 = new JButton("C3");
        buttonC3.setName("ButtonC3");
        board.add(buttonC3);

        JButton buttonA2 = new JButton("A2");
        buttonA2.setName("ButtonA2");
        board.add(buttonA2);

        JButton buttonB2 = new JButton("B2");
        buttonB2.setName("ButtonB2");
        board.add(buttonB2);

        JButton buttonC2 = new JButton("C2");
        buttonC2.setName("ButtonC2");
        board.add(buttonC2);

        JButton buttonA1 = new JButton("A1");
        buttonA1.setName("ButtonA1");
        board.add(buttonA1);

        JButton buttonB1 = new JButton("B1");
        buttonB1.setName("ButtonB1");
        board.add(buttonB1);

        JButton buttonC1 = new JButton("C1");
        buttonC1.setName("ButtonC1");
        board.add(buttonC1);



        add(board);
    }
}