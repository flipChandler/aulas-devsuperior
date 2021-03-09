package aulas.listaencadeada.util;

public class List {
	
	private Node head; // um ponteiro
	
	public void add(Double value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;
	}
	
	// StringBuffer -> uma classe para otimizar Strings grandes | add em memória de forma eficiente
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[");
		Node pointer = head;
		while (pointer != null) {
			stringBuffer.append(pointer.getValue() + " ");
			pointer = pointer.getNext();
		}
		
		stringBuffer.append("]");
		return stringBuffer.toString();
	}
}
