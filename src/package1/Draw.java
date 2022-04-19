package package1;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0,Var.windowWidth, Var.windowHeight);

        g.setColor(Color.WHITE);

        for (int i = 0; i <= 30; i++) {
            g.fillRect(Var.windowWidth/2 - 5, i * 20, 5, 10);

        }
        g.fillRect(Var.x, Var.y, 10, 50);
        g.fillRect(Var.x2, Var.y2, 10, 50);

        g.drawString("" + Var.playerpoints1, Var.windowWidth/2 - 50, 50);
        g.drawString("" + Var.playerpoints2, Var.windowWidth/2 + 50, 50);

        g.fillRect(Var.ballX, Var.ballY, 15, 15);
        repaint();
    }
}