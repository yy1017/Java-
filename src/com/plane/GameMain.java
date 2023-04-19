package com.plane;

import javax.swing.*;

import com.plane.tools.Gametools;

import java.awt.*;
public class GameMain extends JFrame{
    
	public void Gamestart() {
		this.setVisible(true);
    	this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("贞德食泥鸭：超级战坤");
		
	}
    @Override
    public void paint(Graphics g) {
    	super.paint(g);
    	g.drawImage(Gametools.bjimage, 0, 0, null);//第三个参数是图片反转
    	g.drawImage(Gametools.ggImage,200,100, null);
    }
	
	
	
	public static void main(String[]args) {
		GameMain user1 = new GameMain();
		user1.Gamestart();
	}
}
