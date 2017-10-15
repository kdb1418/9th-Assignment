package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Rectangle {
	int x, y, w, h;
}
class MyPanel5 extends JPanel implements MouseListener {
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	public MyPanel5() {
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Rectangle r : array)
			if (r != null)
				g.drawRect(r.x, r.y, r.w, r.h);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if (index > 100)
			return;
		array[index] = new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].w = 50;
		array[index].h = 50;
		index++;
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}
public class RectMouse extends JFrame {
	public RectMouse() {
		setSize(300, 300);
		setTitle("���콺�� �簢�� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel5());
		setVisible(true);
	}
	public static void main(String[] args) {
		RectMouse s = new RectMouse();
	}
}

