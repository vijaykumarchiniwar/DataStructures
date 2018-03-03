package com.learn.datastructures.list.singlylinkedlist;

public class SimpleSinglyLinkedList {

	Node headNode;
	
	public SimpleSinglyLinkedList() {
		headNode = null;
	}

	public void insert(int info) {
		if(headNode == null) {
			headNode = new Node(info);			
		}else {
			Node currentNode = headNode;
			while(currentNode.next != null) {
				currentNode = currentNode.next;				
			}
			Node newNode = new Node(info);
			currentNode.setNext(newNode);
		}
	}
	
	public void insertAtFirst(int info) {
		Node newNode = new Node(info);
		if(headNode != null) {
			newNode.setNext(headNode);
			headNode = newNode;
		}
		else
			headNode = newNode;
	}

	public void delete(int info) {
		if(headNode == null) {
			System.out.println("List is empty");
			return;
		}

		if(headNode.getInfo() == info) {
			System.out.println("It's headNode");
			headNode = headNode.next;
			return;
		}

		Node currentNode = headNode;
		Node previousNode = headNode;
		while(currentNode != null) {
			if(currentNode.getInfo() == info) {
				System.out.println("Found Node " + currentNode.getInfo());
				previousNode.setNext(currentNode.next);
				return;					
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
	}

	public void display() {
		Node currentNode = headNode;
		while(currentNode != null) {
			System.out.print(currentNode.getInfo() + "->");
			currentNode = currentNode.next;				
		}
		System.out.println("End");

	}

	public static void main(String[] args) {

		SimpleSinglyLinkedList list = new SimpleSinglyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);

		list.display();
		
		list.delete(1);
		list.display();
		
		list.delete(3);
		list.display();

		list.delete(6);
		list.display();
		
		list.delete(2);
		list.display();

		list.insertAtFirst(0);
		list.display();
	}
}

class Node {
	int info = 0;
	Node next = null;
	
	public Node() {
	}
	
	public Node(int info) {
		this.info = info;
	}
	
	public Node(int info, Node next) {
		this.info = info;
		this.next = next;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}	
}
