package com.plane;

import javax.swing.*;

import com.plane.tools.Gametools;

import java.awt.*;
public class GameMain extends JFrame{
    
	public void Gamestart() {
		this.setVisible(true);
    	this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("���ʳ��Ѽ������ս��");
		
	}
    @Override
    public void paint(Graphics g) {
    	super.paint(g);
    	g.drawImage(Gametools.bjimage, 0, 0, null);//������������ͼƬ��ת
    	g.drawImage(Gametools.ggImage,200,100, null);
    }
	
	
	
	public static void main(String[]args) {
		GameMain user1 = new GameMain();
		user1.Gamestart();
	}
}
