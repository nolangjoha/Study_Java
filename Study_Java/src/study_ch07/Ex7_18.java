package study_ch07;

import java.awt.*;
import java.awt.event.*;


public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
		
	}
}

class EventHandler implements ActionListener{
	public void actionPerformed (ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}