package day21;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 {
	public static void main(String[] args) {
		
		new UI();
	}
}
class UI{
	Frame f;
	Button red,blue,exit;
	Panel p1;
	
	UI(){
		f=new Frame("awt UI Test");
		p1 = new Panel();
		
		p1.add(red=new Button("red"));
		p1.add(blue=new Button("blue"));
		p1.add(exit=new Button("exit"));
		f.add(p1);
		
		f.setSize(300,300);
		f.setVisible(true);
		
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.red);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.blue);
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		
	}
}

class WindowEventP extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
