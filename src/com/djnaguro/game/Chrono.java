package com.djnaguro.game;

public class Chrono implements Runnable{
	private static final int PAUSE = 3;
	
	public void run() {
		while(true) {
			MainFrame.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
	}
	
}
