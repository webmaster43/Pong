/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponggame;

/**
 *
 * @author Tutor 101
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Racket {
    private static final int WIDTH = 10, HEIGHT = 60;
    private PongGame game;
    private int up, down;
    private int x;
    private int y, ya;

    public Racket(PongGame game, int up, int down, int x) {
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
    }

    public void update() {
        if (y > 0 && y < game.getHeight() - HEIGHT - 29)
            y += ya;
        else if (y == 0)
            y++;
        else if (y == game.getHeight() - HEIGHT - 29)
            y--;
    }

    public void pressed(int keyCode) {
        if (keyCode == up)
            ya = -1;
        else if (keyCode == down)
            ya = 1;
    }

    public void released(int keyCode) {
        if (keyCode == up || keyCode == down)
            ya = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public void paint(Graphics g) {
        //g.setColor(Color.BLACK);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
