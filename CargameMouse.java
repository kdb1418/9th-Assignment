package Assignment;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
class MyPanel4 extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	public MyPanel4() {
	try {
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {
		System.out.println("no image");
		System.exit(1);
	}
	addMouseListener(new MouseListener() {
		public void mousePressed(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	});
}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
		}
	}
	public class CargameMouse extends JFrame {
		public CargameMouse() {
			add(new MyPanel4());
			setSize(300, 500);
			setVisible(true);
		}
		public static void main(String[] arg) {
			new CargameMouse();
		}	
	}

