/**
 * The class represents for the circular unsorted linked list
 * 
 * @author Varik Hoang <varikmp@uw.edu>
 * @author FIRST_NAME LAST_NAME
 * @param <Type> the generic data type
 */
public class UnsortedList<Type>
		extends AbstractList<Type>
		implements List<Type> {
	/**
	 * The constructor for the circular unsorted linked list.
	 */

	protected static class Node<Type>{
		protected Type currData;

		protected Node<Type> nextNode;

		public Node(final Type data) {
			// this() keyword calls constructer below and passes values as default values
			this(data, null);
		}

		public Node(final Type data, final Node<Type> next) {
			this.currData = data;
			this.nextNode = next;
		}
	}

	protected Node<Type> currTail;

	protected int currSize;

	public UnsortedList() {
		this.currTail = null;
		this.currSize = 0;
	}

	@Override
	public boolean contains(Type value) {
		return getIndex(value) >= 0;
	}

	@Override
	public void insert(final Type value) {
		// TODO Auto-generated method stub
		if (value == null) {
			throw new NullPointerException("Can't insert a null value.");
		}
		Node<Type> newNode = new Node<>(value);

		if (isEmpty()) {
			currTail = newNode;
			currTail.nextNode = currTail;
		} else {
			newNode.nextNode = currTail.nextNode;
			currTail.nextNode = newNode;
			currTail = newNode;
		}
		currSize++;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		currTail = null;
		currSize = 0;
	}

	@Override
	public int getSize() {
		return currSize;
	}

	@Override
	public Type remove(Type value) {
		// TODO Auto-generated method stub
		if (value == null) {
			throw new NullPointerException("Can't remove null value");
		} else if (isEmpty()) {
			return null;
		}

		Node<Type> prev = currTail;
		Node<Type> curr = currTail.nextNode;

		for (int i = 0; i < currSize; i++) {
			if (curr.currData.equals(value)) {
				Type removal = curr.currData;
				
			}
		}
		return null;
	}

	@Override
	public Type removeAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, Type value) {
		// TODO Auto-generated method stub
	}

	@Override
	public Type get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
