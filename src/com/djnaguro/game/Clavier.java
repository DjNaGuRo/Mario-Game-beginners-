package com.djnaguro.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			MainFrame.scene.setDx(1);
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			MainFrame.scene.setDx(-1);
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {}
	
}
