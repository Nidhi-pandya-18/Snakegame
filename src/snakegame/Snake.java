package snakegame;

import javax.swing.*;

public class Snake extends JFrame {
     
    Snake() {
        super("Snake Game");
        add(new Board());
        pack();

        // setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
       
        
    }
    
    public static void main(String[] args) {
        new Snake(). setVisible(true);
    }
}
