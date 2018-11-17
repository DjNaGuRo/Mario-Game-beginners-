package com.djnaguro.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel {
	private static final long serialVersionUID = 1L;
	private ImageIcon bgIcon;
	private Image bgImg;
	
	// temporary fields
	private ImageIcon marioIco;
	private Image marioImg;
	
	private int Xbg;
	private int dx = 0;
	
	public Scene(){
		this.Xbg = -50;
		
		this.bgIcon = new ImageIcon(getClass().getResource("/images/fond_ecran_mario.png"));
		this.bgImg = this.bgIcon.getImage();
		
		this.marioIco = new ImageIcon(getClass().getResource("/images/marioWalksRight.gif"));
		this.marioImg = this.marioIco.getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2d = (Graphics2D)g;
		
		g2d.drawImage(bgImg, this.Xbg, 0, null);
		g2d.drawImage(marioImg, 300, 280, null);
	}
	
	public int getDx() {return dx;}
	public void setDx(int dx) {this.dx = dx;}
}
