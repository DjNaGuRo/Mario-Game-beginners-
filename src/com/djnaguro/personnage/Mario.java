package com.djnaguro.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends Personnage {
	private static Mario mario;
	
	private Image marioImage;
	
	private Mario(int x, int y) {
		super(x, y, 28, 50);
		this.marioImage = new ImageIcon(getClass().getResource("/images/marioWalksRight.gif")).getImage();
	}
	
	public static Mario getMario() {
		if(mario == null) {
			synchronized (Mario.class) {
				if(mario == null) {mario = new Mario(250, 280);}
			}
		}
		return mario;
	}

	public Image getMarioImage() {
		return marioImage;
	}

	public void setMarioImage(Image marioImage) {
		this.marioImage = marioImage;
	}
	
}
