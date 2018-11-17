package com.djnaguro.game;

public class Chrono implements Runnable{
	private static final int PAUSE = 3;

	public void run() {
		try {
			Thread.sleep(PAUSE);
			MainFrame.scene.repaint();
		} catch (InterruptedException e) {}
	}
	
}
