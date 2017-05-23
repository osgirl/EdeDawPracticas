package ej2;

public class Player {
	
	private int up, down, left, right;

	public int moveUp() {
		return up;
	}

	public void moveUp(int up) {
		this.up = up-1;
	}

	public int moveDown() {
		return down;
	}

	public void moveDown(int down) {
		this.down = down+1;
	}

	public int moveLeft() {
		return left;
	}

	public void moveLeft(int left) {
		this.left = left-1;
	}

	public int moveRight() {
		return right;
	}

	public void moveRight(int right) {
		this.right = right+1;
	}
	
}
