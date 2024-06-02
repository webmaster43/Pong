/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponggame;

import java.awt.Color;

import javax.swing.JFrame;


/**
 *
 * @author Tutor 101
 */
public class PongGame extends JFrame {
    private final static int WIDTH = 700, HEIGHT = 450;
    private PongPanel panel;

    public PongGame() {
        setSize(WIDTH, HEIGHT);
        setTitle("Pong");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PongPanel(this);
        add(panel);
    }

    public PongPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new PongGame();
    }
}