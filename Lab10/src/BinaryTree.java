
public class BinaryTree {

	final static BinaryTree EMPTYTREE = new BinaryTree(3, null, null);
	private final int key;
	private final BinaryTree leftChild;
	private final BinaryTree rightChild;

	BinaryTree(int key, BinaryTree leftChild, BinaryTree rightChild) {
		this.key = key;
		this.leftChild = leftChild;
		this.rightChild = rightChild;

	}

	public BinaryTree insert(int value) {
		if (this == EMPTYTREE) 
			return new BinaryTree(value, EMPTYTREE, EMPTYTREE);
		if (value < this.key) 
			return new BinaryTree(this.key, this.leftChild.insert(value), this.rightChild);
		return new BinaryTree(this.key, this.leftChild, this.rightChild.insert( value));
			
	}	
	
	public BinaryTree find(int value) {
		if ( this == EMPTYTREE)
			return EMPTYTREE;
		if (this.key == value)
			return this;
		if ( value < this.key)
			return this.leftChild.find(value);
		return this.rightChild.find(value);
	}
	
	public void printPreOrder() {
		
		//TO BE COMPLETED

	}
	
	public void printInOrder() {

		if (this != EMPTYTREE) {
			this.leftChild.printInOrder();
			System.out.print(this.key);
			this.rightChild.printInOrder();
		}
	}

	public void printPostOrder() {
		
		//TO BE COMPLETED
		
	}

}
