package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class RockPaperScissor extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	private JPanel panel;
	private JTextField output, information;
	private JButton rock, paper, scissor;
	public RockPaperScissor() {
		super("���� ���� ��");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 3));
		information = new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�!");
		output = new JTextField(20);
		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		if(e.getSource()==rock) {
			if(computer==SCISSOR)
				output.setText("����� �¸�");
			else if(computer==ROCK)
				output.setText("�����");
			else output.setText("��ǻ�� �¸�");
		}
		else if(e.getSource()==paper) {
			if(computer==ROCK)
				output.setText("����� �¸�");
			else if(computer==PAPER)
				output.setText("�����");
			else output.setText("��ǻ�� �¸�");
		}
		else {
			if(computer==PAPER)
				output.setText("����� �¸�");
			else if(computer==SCISSOR)
				output.setText("�����");
			else output.setText("��ǻ�� �¸�");
		}
	}
	public static void main(String[] args) {
		RockPaperScissor g = new RockPaperScissor();
	}
}
