import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener{

    Draw drawing = new Draw();

    public MyFrame(){
        this.drawing = new Draw();
    }

    public void keyPressed(KeyEvent e){
              if (e.getKeyCode() == KeyEvent.VK_UP){
            drawing.moveUp();
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            drawing.moveRight();
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            drawing.moveDown();
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            drawing.moveLeft();

        }

    }

    public void keyReleased(KeyEvent e){
  

    }

    public void keyTyped(KeyEvent e){
        System.out.println("asdasd");

    }
    public static void main(String args[]){
        MyFrame gameFrame = new MyFrame();

        Draw drawing = new Draw();
        gameFrame.setSize(600,600);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
        gameFrame.getContentPane().add(gameFrame.drawing);
        gameFrame.addKeyListener(gameFrame);
        System.out.println("practical programming");
    }
}
