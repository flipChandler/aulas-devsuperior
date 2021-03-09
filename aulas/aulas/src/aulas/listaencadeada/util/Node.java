package aulas.listaencadeada.util;

public class Node {
	
	private Double value;
	private Node next; // esse tipo tem uma defini��o recursiva
		
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
