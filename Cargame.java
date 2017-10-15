package Assignment;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
class MyPanel2 extends JPanel {
	  BufferedImage img = null;	
	  int img_x = 100, img_y = 100;
	  public MyPanel2() {
		try {
			img = ImageIO.read(new File("car.gif"));
		} catch (IOException e) {							System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:		img_y -= 10;	break;
				case KeyEvent.VK_DOWN:	img_y += 10;	break;
				case KeyEvent.VK_LEFT:		img_x -= 10;	break;
				case KeyEvent.VK_RIGHT:	img_x += 10;	break;
				}
				repaint();
			} 
			public void keyReleased(KeyEvent arg0) {		}
			public void keyTyped(KeyEvent arg0) {		}
			});
		this.requestFocus(); 	
		setFocusable(true);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null); 
		}
	}
	public class Cargame extends JFrame {
		public Cargame() {
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(new MyPanel2());
			setVisible(true);
		}
		public static void main(String[] args) {
			Cargame s = new Cargame();
		}
	}
