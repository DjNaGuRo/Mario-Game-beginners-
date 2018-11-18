package com.djnaguro.personnage;

public abstract class Personnage {
	private int width, height; 
	private int x, y; // coordonates of the character
	private boolean walk; // for knowing if the character is moving (walking) or not
	private boolean toRight; // true if the character is going to the right side
	public int compter; // number of steps 
	
	public Personnage(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.walk = false;
		this.toRight = true;
		this.compter = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isWalk() {
		return walk;
	}

	public boolean isToRight() {
		return toRight;
	}

	public int getCompter() {
		return compter;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}

	public void setToRight(boolean toRight) {
		this.toRight = toRight;
	}

	public void setCompter(int compter) {
		this.compter = compter;
	}
	
	
}
