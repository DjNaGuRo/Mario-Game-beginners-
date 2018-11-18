package com.djnaguro.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.djnaguro.personnage.Mario;

public class Scene extends JPanel {
	private static final long serialVersionUID = 1L;
	private ImageIcon bgIcon;
	private Image bgImg, bgImg1;
	private Image castelImg, startImg;
	private int imgWidth;
	

	private Mario mario;
	
	private int Xbg, Xbg1;
	private int dx;
	private int xPos;
	
	public Scene(){
		this.Xbg = -50;
		this.dx = 0;
		this.xPos = -1;
		
		this.bgIcon = new ImageIcon(getClass().getResource("/images/fond_ecran_mario.png"));
		this.bgImg = this.bgIcon.getImage();
		this.bgImg1 = this.bgIcon.getImage();
		this.castelImg = new ImageIcon(getClass().getResource("/images/chateau1.png")).getImage();
		this.startImg = new ImageIcon(getClass().getResource("/images/depart.png")).getImage();
		this.mario = Mario.getMario();
		this.imgWidth = this.bgImg.getWidth(null);
		this.Xbg1 = imgWidth - 100;
		// Add an keyListener to the scene
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		Thread chrono = new Thread(new Chrono());
		chrono.start();
	}
	
	public void bgMove() {
		
		if(this.xPos >= 0) {
			this.xPos = this.xPos + this.dx;
			this.Xbg = this.Xbg - this.dx;
			this.Xbg1 = this.Xbg1 - this.dx;
		}
		
		if(this.Xbg == -this.imgWidth + 50) {
			this.Xbg = this.imgWidth - 50;
		}
		else if(this.Xbg == this.imgWidth - 50) {
			this.Xbg = -this.imgWidth + 50;
		}
		else if(this.Xbg1 == this.imgWidth - 50) {
			this.Xbg1 = -this.imgWidth + 50;
		}
		else if(this.Xbg1 == -this.imgWidth + 50) {
			this.Xbg1 = this.imgWidth - 50;
		}
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2d = (Graphics2D)g;
		
		this.bgMove();
		System.out.println("Xbg: " + Xbg + " Xbg1: " + Xbg1 + " xPos: " + xPos + " Image width: " + this.bgImg.getWidth(null));
		g2d.drawImage(bgImg, this.Xbg, 0, null);
		g2d.drawImage(bgImg1, this.Xbg1, 0, null);
		g2d.drawImage(mario.getMarioImage(), mario.getY(), mario.getY(), null);
		g2d.drawImage(castelImg, 10 - this.xPos, 208, null);
		g2d.drawImage(startImg, 170 - this.xPos, 240, null);
	}
	
	public int getDx() {return dx;}
	public void setDx(int dx) {this.dx = dx;}
	public int getXPos() {return this.xPos;}
	public void setXPos(int xPos) {this.xPos = xPos;}
}
