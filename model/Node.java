package model;

public class Node {
	int value;
	public int getValue() {
		return value;
	}


	public Node(int value) {
		this.Left = null;
		this.Right = null;
		this.value = value;

	}

	public Node(int value, Node Left, Node Right) {
		this.Left = Left;
		this.Right = Right;
		this.value = value;

	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return Left;
	}

	public void setLeft(Node left) {
		Left = left;
	}

	public Node getRight() {
		return Right;
	}

	public void setRight(Node right) {
		Right = right;
	}

	Node Left;
	Node Right;
	

}
