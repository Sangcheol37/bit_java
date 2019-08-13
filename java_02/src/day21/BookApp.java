package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp {
	public static void main(String[] args) {

		new Gui();
	}
}

class Gui extends JFrame {
	static int num = 0;
	BookMgr mgr;
	JButton add, list, delete, search, exit, save, load;
	TextField title, price, isbn;
	TextArea output;
	T2 t2 = new T2();

	Gui() {
		mgr = new BookMgr();
		t2.start();
		Panel p1 = new Panel();

		p1.add(add = new JButton("ADD"));
		add.setBackground(Color.white);
		p1.add(list = new JButton("LIST"));
		list.setBackground(Color.white);
		p1.add(delete = new JButton("DELETE"));
		delete.setBackground(Color.white);
		p1.add(search = new JButton("SEARCH"));
		search.setBackground(Color.white);
		p1.add(exit = new JButton("EXIT"));
		exit.setBackground(Color.red);
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 2));
		p2.setBackground(Color.white);
		p2.add(new JLabel("    ISBN    "));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("  제       목   "));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("  가       격   "));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);

		MenuBar mb = new MenuBar();
		Menu menufile = new Menu("File");
		MenuItem savefile = new MenuItem("Save");
		MenuItem loadfile = new MenuItem("Load");
		menufile.add(savefile);
		menufile.add(loadfile);
		menufile.addSeparator();
		mb.add(menufile);
		setMenuBar(mb);

		add(output = new TextArea(20, 50));
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.addActionListener((e) -> {
			output.setText("");
			output.append("***************************************\n");
			mgr.PrintBookList().forEach(i -> output.append(i + "\n"));
			// mgr.PrintBookList();
			output.append("***************************************\n");
		});
		add.addActionListener((e) -> {
			// 삭제해서 isbn이 빠진 자리에 추가로 add 하고 싶은 경우의 수 생각해서 넣기
			try {
				int p = Integer.parseInt(price.getText());
				boolean b = mgr.AddBook(new Book(++num, title.getText(), p));
				if (b) {
					output.setText("등록 성공");
				}
			} catch (Exception e2) {
				output.setText("등록실패!");
			}
		});
		delete.addActionListener((e) -> {
			output.setText("");
			String t = title.getText();
			if (mgr.DeleteBLS(t) == true) {
				output.setText("[" + t + "]가 삭제 되었습니다.");
			} else
				output.setText("[" + t + "] 도서가 등록되어 있지 않습니다.");
		});
		search.addActionListener((e) -> {
			/*
			 * if(!(title.getText().length()>1)) output.setText("찾으시는 도서가 없습니다.");
			 */
			// 아무것도 입력안하고 서치했을때 왜 isbn==1 짜리가 뜨는 것인가 (오류수정 할 것)

			output.setText(mgr.FindBLS(title.getText()));

		});
		exit.addActionListener(e -> {
			// x 표시로 종료할때도 save가 되도록
			mgr.SaveFile();
			System.exit(0);
		});

		savefile.addActionListener((e) -> {
			mgr.SaveFile();
		});

		loadfile.addActionListener((e) -> {
			// mgr.LoadFile(num);
			// num값을 받아서 넘기면 isbn을 변경할 수 있을거 같은데 왜 오류가 나는 것인가.
			mgr.LoadFile();
			output.setText("저장된 기록을 가져왔습니다. [LIST] 버튼을 눌러서 확인하십시오.");
		});

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				mgr.SaveFile();
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		class WindowEventP extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				mgr.SaveFile();
				System.exit(0);
			}
		}
	}	
	class T2 extends Thread implements Runnable {
			@Override
			public void run() {
				try {
					while(true) {
						Thread.sleep(100000);
						mgr.SaveFile();
					}
				} catch (Exception e) {
				}
			}
		}

}

