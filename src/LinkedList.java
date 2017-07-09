
public class LinkedList implements LinkedListInterface {
	Node start = null;

	Node end = null;

	int size = 0;

	@Override
	public boolean isEmpty() {
		if (size > 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(Object data) {
		start = new Node(data, start);
		size++;

	}

	@Override
	public void addLast(Object data) {
		Node temp = start;
		if (isEmpty()) {
			start = new Node(data, null);
			size++;
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			end = new Node(data, null);
			temp.setNext(end);
			size++;
		}
	}

	@Override
	public void add(Object data, int index) {
		if (start == null) {
			start = new Node(data, null);
		} else {
			int current = 0;
			Node temp = start;
			while (current != index - 1) {
				temp = temp.getNext();
				current++;
			}
			Node after = temp.getNext();
			Node add = new Node(data, after);
			temp.setNext(add);
		}
		size++;
	}

	@Override
	public void remove(int index) {
		if (size == 1) {
			start = null;
		} else {
			int current = 0;
			Node temp = start;
			while (current != index - 1) {
				temp = temp.getNext();
				current++;
			}
			Node after = temp.getNext();
			after = after.getNext();
			temp.setNext(after);
		}
		size--;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = "";
		Node temp = start;
		while (temp.getNext() != null) {
			output += temp.getData();
			temp = temp.getNext();
		}
		output += temp.getData();
		return output;
	}

}
