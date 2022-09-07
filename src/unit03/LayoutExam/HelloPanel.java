package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel() {
		
		JPanel p = new JPanel();
		p.setBackground(Color.cyan);
		add(p);
		
		JButton jb = new JButton("버튼1");
		jb.setBackground(Color.yellow);
		p.add(jb);
		JButton jb1 = new JButton("버튼2");
		jb1.setBackground(Color.MAGENTA);
		p.add(jb1);
		setTitle("안녕버튼");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloPanel();
	}

}
