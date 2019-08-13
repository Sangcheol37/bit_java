package day20;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Test04 {
	public static void main(String[] args) {
		new UI();
	}
}

class UI{
	Frame f;
	Button ok,exit;
	UI(){
		f= new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		//눈에 보이게 하려면 setVisible(True) 설정해야함
		ok = new Button("ok");
		exit = new Button("exit");
		
		Panel p1 = new Panel();
		p1.add(ok);
		p1.add(exit);
		f.add(p1);
	}
}