package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener listener = new MyListener(); 
    public MyFrame() {
          this.setSize(400, 300);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setTitle("�̺�Ʈ ����");
          panel = new JPanel();
          button1 = new JButton("�����");
          button1.addActionListener(listener);
          panel.add(button1);
          button2 = new JButton("��ũ��");
          button2.addActionListener(listener);
          panel.add(button2);
          this.add(panel);
          this.setVisible(true);
    }
    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
               if (e.getSource() == button1) {
                      panel.setBackground(Color.YELLOW);
               } else if (e.getSource() == button2) {
                      panel.setBackground(Color.PINK);
               }
        }

  }
}
public class ChangeBGColor {
  public static void main(String[] args) {
        MyFrame f = new MyFrame();
  }
}