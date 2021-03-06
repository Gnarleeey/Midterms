import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

   private BufferedImage image;
   private URL resource = getClass().getResource("run0.png");


   public int x = 30;
   public int y = 30;

   public int state = 0;

   public Draw(){
       try{
           image = ImageIO.read(resource);
       }
       catch(IOException e){
           e.printStackTrace();
       }
   }
   public void reloadImage(){
       state++;

      if (state == 0){
          resource = getClass().getResource("run0.png");
      }

      else if (state == 1){
          resource = getClass().getResource("run01.png");
      }

      else if (state == 2){
          resource = getClass().getResource("run02.png");
      }

      else if (state == 3){
          resource = getClass().getResource("run03.png");
      }

      else if (state == 4){
          resource = getClass().getResource("run04.png");
      }

      else if (state == 5){
          resource = getClass().getResource("run05.png");
          state = 0;
      }

      try {
          image = ImageIO.read(resource);
      }
      catch(IOException e){
          e.printStackTrace();
      }
   }

	public void moveUp(){
		y = y - 5;
		repaint();
		reloadImage();
	}
	public void moveDown(){
		y = y + 5;
		repaint();

		reloadImage();
	}
	public void moveLeft(){
		x = x - 5;
		repaint();
		reloadImage();
	}
	public void moveRight(){
		x = x + 5;
		repaint();
		reloadImage();
	}
	 
	 public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(image, x,y, this);

		}
}