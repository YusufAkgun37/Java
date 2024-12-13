
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Shot {
    private int x;
    private int y;

    public Shot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
public class Game extends JPanel implements KeyListener,ActionListener{
    
    Timer timer = new Timer(5, this);
    
    private long startTime;
    private int shots_spent = 0;
    private BufferedImage image;
    
    private ArrayList<Shot> shots = new ArrayList<Shot>();
    private int shotdirY = 5;
    private int ballX = 0;
    private int balldirX = 5;
    private int spaceShipX = 0;
    private int dirspaceX = 20;
    
    public boolean check(){
        
        for(Shot shot : shots){
            
            if (new Rectangle(shot.getX(),shot.getY(),10,20).intersects(new Rectangle(ballX,0,20,20))) {
                return true;
            }
            
        }
        return false;
    }

    public Game() {
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("spaceship.png")));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.BLACK);
        
        startTime = System.currentTimeMillis(); 
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        g.setColor(Color.red);
        g.fillOval(ballX, 0, 20, 20);
        
        g.drawImage(image, spaceShipX, 490, image.getWidth() / 10, image.getHeight() / 10,this);
        
        for(Shot shot : shots){
            
            if (shot.getY() < 0) {
                shots.remove(shot);
            }     
        }
        
        g.setColor(Color.BLUE);
        
        for(Shot shot : shots){
            
            g.fillRect(shot.getX(), shot.getY(), 10, 20);
        }
        
        if (check()) {
            
            timer.stop();
            long elapsedTime = System.currentTimeMillis() - startTime;
            String message = "You won...\n"+
                             "Spent shots : "+ shots_spent +
                             "\nElapsed time : " + elapsedTime / 1000.0 + "sec";
            
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
        
    }

    @Override
    public void repaint() {
        super.repaint(); 
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {    
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_LEFT) {
            
            if (spaceShipX <= 0) {
                spaceShipX = 0;
            }
            else{
                spaceShipX -= dirspaceX;
            }
        }
        else if (c == KeyEvent.VK_RIGHT){
            
            if (spaceShipX >=  740) {
                spaceShipX = 740;
            }
            else{
                spaceShipX += dirspaceX;
            }
        }
        
        else if (c == KeyEvent.VK_SPACE) {
            
            shots.add(new Shot(spaceShipX+15,470));
            shots_spent++;
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(Shot shot : shots){
            
            shot.setY(shot.getY() - shotdirY);
            
        }
        
        ballX += balldirX;
        
        if (ballX >= 750) {
            
            balldirX = -balldirX;
            
        }
        if (ballX <= 0) {
            
            balldirX = -balldirX;
            
        }
        
        repaint();
    }
    
    
    
}
