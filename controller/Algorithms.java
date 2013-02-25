package controller;

import model.Node;

public class Algorithms {
	Node head;
	Node curr;

	public Algorithms(Node head) {
		this.head = head;
		this.curr = head;
	}

	public void Add(Node newNode) {
		if (head == null) {
			head = newNode;

		}

		if (newNode.getValue() < curr.getValue()) {
			if (curr.getLeft() == null) {
				curr.setLeft(newNode);
				curr = head;
			} else {
				curr = curr.getLeft();
				Add(newNode);
			}

		} else if (newNode.getValue() > curr.getValue()) {
			if (curr.getRight() == null) {
				curr.setRight(newNode);
				curr = head;
			} else {
				curr = curr.getRight();
				Add(newNode);
			}
		}
	}

	public void remove(Node tarNode) {

		if(curr == tarNode && curr.getRight() == null && curr.getLeft() == null){
			curr.setValue((Integer) null);
			return;
		}
		
		if(curr == tarNode && curr.getRight() == null && curr.getLeft() != null){
			curr.equals(curr.getLeft());
			return;
		}
		if(curr != tarNode && curr.getRight() == null && curr.getLeft() == null){
			curr.equals(curr.getRight());
			return;
		}
		if(curr == tarNode && curr.getRight() != null && curr.getLeft() != null){
			Node temp = new Node(curr.getValue(), curr.getLeft(), curr.getRight());
			
			temp = temp.getRight();
			while(temp.getLeft().getLeft() != null && temp.getLeft().getRight() != null){
				temp = temp.getLeft();
			}
			
			temp.getLeft().setRight(curr.getRight());
			temp.getLeft().setLeft(curr.getLeft());
			temp.setLeft(null);
			
					
			return;
		}
		
	}
	
	int dash = 0;
	public void print(){
		if (head == null){
			System.out.println("no tree");
			return;
		}
		dash ++;
		printDash();
		System.out.println(curr.getValue());
		
		if(curr.getLeft() != null){
			curr = curr.getLeft();
			print();
			
		}else{
			dash --;
			return;
		}
		
		if(curr.getRight() != null){
			curr = curr.getRight();
			print();
		}else{
			dash --;
			return;
		}
		
	}

	private void printDash() {
		// TODO Auto-generated method stub
		for(int i = 0; i< dash; i++){
			System.out.print("-");
		}
	}
}
