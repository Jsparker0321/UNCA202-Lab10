/**
 * 
 * @author Jessica Parker
 * @version Lab 10: Binary Trees: A Recursive Data Structure
 * @version CSCI 202
 * @version November 16th, 2018
 *
 */
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
		return new BinaryTree(this.key, this.leftChild, this.rightChild.insert(value));

	}

	public BinaryTree find(int value) {
		if (this == EMPTYTREE)
			return EMPTYTREE;
		if (this.key == value)
			return this;
		if (value < this.key)
			return this.leftChild.find(value);
		return this.rightChild.find(value);
	}

	public void printPreOrder() {
		
		if (this != EMPTYTREE) {
			System.out.print(this.key + ", ");
			this.leftChild.printPreOrder();
			this.rightChild.printPreOrder();
			
		}


	}

	public void printInOrder() {

		if (this != EMPTYTREE) {
			this.leftChild.printInOrder();
			System.out.print(this.key +  ", ");
			this.rightChild.printInOrder();
		}
	}

	public void printPostOrder() {
		
		if (this != EMPTYTREE) {
			this.leftChild.printPostOrder();
			this.rightChild.printPostOrder();
			System.out.print(this.key + ", ");

		}

	}

	public static void main(String[] args) {
		BinaryTree testTree = new BinaryTree(25,
				new BinaryTree(12, new BinaryTree(9, EMPTYTREE, EMPTYTREE), new BinaryTree(14, EMPTYTREE, EMPTYTREE)),
				new BinaryTree(36, new BinaryTree(29, EMPTYTREE, EMPTYTREE), EMPTYTREE));
		
		System.out.println("Original print of In-Order: ");
		testTree.printInOrder();
		
		System.out.println();
		
		BinaryTree newTree = testTree.insert(11);
		
		
		System.out.println("New Tree In-Order after an insert: ");
		newTree.printInOrder();
		
		System.out.println("");
		System.out.println("Original print of In-Order: ");
		testTree.printInOrder();
		
		BinaryTree tree03 = EMPTYTREE.insert(34).insert(48).insert(29).insert(36).insert(12).insert(9);
		
		System.out.println();
		
		System.out.println("Pre-Order Traversal: ");
		tree03.printPreOrder();
		System.out.println();
		
		System.out.println("In-Order Traversal: ");
		tree03.printInOrder();
		System.out.println();
		
		System.out.println("Post-Order: ");
		tree03.printPostOrder();
		System.out.println();
	}

}
