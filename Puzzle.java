package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyButton extends JButton{
	static int count = 0;
	int index;
	public MyButton(String s) {
		super(s);
		index = count++;
	}
}
public class Puzzle extends JFrame implements ActionListener{
	MyButton[] buttons;
	MyButton reset;
	JTextField txt;
	public Puzzle() {
		super("puzzle");
		txt = new JTextField(15);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 2, 2));
		buttons = new MyButton[9];
		for(int i=0; i<8; i++)
			buttons[i] = new MyButton(""+(i+1));
		buttons[8] = new MyButton(" ");
		for(int i=0; i<9; i++) {
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		add(panel, BorderLayout.CENTER);
		reset = new MyButton("reset");
		reset.setBackground(Color.red);
		reset.setForeground(Color.yellow);
		add(txt, BorderLayout.NORTH);
		add(reset, BorderLayout.SOUTH);
		reset.addActionListener(this);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		MyButton b = (MyButton)e.getSource();
		String s = e.getActionCommand();
		txt.setText(txt.getText()+s);
		if(b.getText().equals(" ")==true)return;
		if(b.index==0) {
			if(buttons[1].getText().equals(" "))
				{buttons[1].setText(b.getText()); b.setText(" ");}
			if(buttons[3].getText().equals(" "))
				{buttons[3].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==1) {
			if(buttons[0].getText().equals(" "))
				{buttons[0].setText(b.getText()); b.setText(" ");}
			if(buttons[2].getText().equals(" "))
				{buttons[2].setText(b.getText()); b.setText(" ");}
			if(buttons[4].getText().equals(" "))
				{buttons[4].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==2) {
			if(buttons[1].getText().equals(" "))
				{buttons[1].setText(b.getText()); b.setText(" ");}
			if(buttons[5].getText().equals(" "))
				{buttons[5].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==3) {
			if(buttons[0].getText().equals(" "))
				{buttons[0].setText(b.getText()); b.setText(" ");}
			if(buttons[4].getText().equals(" "))
				{buttons[4].setText(b.getText()); b.setText(" ");}
			if(buttons[6].getText().equals(" "))
				{buttons[6].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==4) {
			if(buttons[1].getText().equals(" "))
				{buttons[1].setText(b.getText()); b.setText(" ");}
			if(buttons[3].getText().equals(" "))
				{buttons[3].setText(b.getText()); b.setText(" ");}
			if(buttons[5].getText().equals(" "))
				{buttons[5].setText(b.getText()); b.setText(" ");}
			if(buttons[7].getText().equals(" "))
				{buttons[7].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==5) {
			if(buttons[2].getText().equals(" "))
				{buttons[2].setText(b.getText()); b.setText(" ");}
			if(buttons[4].getText().equals(" "))
				{buttons[4].setText(b.getText()); b.setText(" ");}
			if(buttons[8].getText().equals(" "))
				{buttons[8].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==6) {
			if(buttons[3].getText().equals(" "))
				{buttons[3].setText(b.getText()); b.setText(" ");}
			if(buttons[7].getText().equals(" "))
				{buttons[7].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==7) {
			if(buttons[4].getText().equals(" "))
				{buttons[4].setText(b.getText()); b.setText(" ");}
			if(buttons[6].getText().equals(" "))
				{buttons[6].setText(b.getText()); b.setText(" ");}
			if(buttons[8].getText().equals(" "))
				{buttons[8].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==8) {
			if(buttons[5].getText().equals(" "))
				{buttons[5].setText(b.getText()); b.setText(" ");}
			if(buttons[7].getText().equals(" "))
				{buttons[7].setText(b.getText()); b.setText(" ");}
		}
		if(b.index==9) {
			for(int i=0; i<8; i++)
				buttons[i].setText(""+(i+1));
			buttons[8].setText(" ");
			txt.setText("");
		}
	}

	public static void main(String[] args) {
		Puzzle p = new Puzzle();
	}
}
