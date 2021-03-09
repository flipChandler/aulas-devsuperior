package aulas.listaencadeada.util;

public class Node<T> {
	
	private T value;
	private Node<T> next; // esse tipo tem uma definição recursiva
		
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
