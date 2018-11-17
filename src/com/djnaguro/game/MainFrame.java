package com.djnaguro.game;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Scene scene;
	
	public MainFrame(){
		super("Jeu style Mario");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true); 
		this.setResizable(false);
		this.setSize(700, 360);
		this.setLocationRelativeTo(null);
		
		scene = new Scene();
		this.setContentPane(scene);
	}
}
