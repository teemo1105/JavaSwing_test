package unit03.LayoutExam;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jdk.jfr.SettingControl;
public class Hellobutton extends JFrame{
	Hellobutton() {
		JPanel p = new JPanel();
		p.setBackground(Color.green);
		add(p);
		JButton jb = new JButton("��ư1");
		p.add(jb);
		setTitle("�ȳ��ư");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Hellobutton();

	}

}
