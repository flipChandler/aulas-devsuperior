package aulas.listaencadeada.util;

public class List<T> {
	
	private Node<T> head; // um ponteiro
	
	public void add(T value) {
		Node<T> node = new Node<T>();
		node.setValue(value);
		node.setNext(head);
		head = node;
	}
	
	// StringBuffer -> uma classe para otimizar Strings grandes | add em memória de forma eficiente
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[");
		Node<T> pointer = head;
		while (pointer != null) {
			stringBuffer.append(pointer.getValue() + " ");
			pointer = pointer.getNext();
		}
		
		stringBuffer.append("]");
		return stringBuffer.toString();
	}
}
