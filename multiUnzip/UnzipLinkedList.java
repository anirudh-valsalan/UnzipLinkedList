

import java.util.Scanner;
/*
 * Program to Implement multiUnzip.
 */
public class UnzipLinkedList<T> {
	static Node headNode = null;

	/*
	 * Method to unzip the linked list based on the input node and interval.
	 */
	public static <T> Node<T> unzipLink(Node<T> inputNode, int interval) {
		// currentNodePtr -node pointing to current node.
		// tailNode -tail node.
		// tailNodePtr -tail node pointer.
		// linkedNodeOutput - output node.
		// linkedNodeOpPtr - output node pointer.
		// counter variable -i
		
		Node<T> currentNodePtr = inputNode;
		Node<T> tailNode = null;
		Node<T> tailNodePtr = null;
		Node<T> linkedNodeOutput = new Node<T>(null);
		Node<T> linkedNodeOpPtr = linkedNodeOutput;
		
		int i = 1;

		while (null != currentNodePtr) {
			// exit the loop if the interval is 1.
			if (interval == 1) {
				linkedNodeOpPtr.nextNode = currentNodePtr;
				break;
			}
			// if the counter % interval is one then increment Linked Node
			// Output
			// pointer.
			if (i % interval == 1) {
				linkedNodeOpPtr.nextNode = currentNodePtr;
				linkedNodeOpPtr = linkedNodeOpPtr.nextNode;

			} else {
				// initialize tailNode.
				if (tailNode == null) {
					tailNode = currentNodePtr;
					tailNodePtr = tailNode;
				} else {
					// increment the tail Node pointer.
					tailNodePtr.nextNode = currentNodePtr;

					tailNodePtr = tailNodePtr.nextNode;

				}

			}
			// if the currentNodePtr iterate over the entire linked list
			// then copy the contentOf tailNode to currentNodePtr
			// also decrement the counter
			if (currentNodePtr.nextNode == null) {
				tailNodePtr.nextNode = null;
				currentNodePtr = tailNode;
				i = 1;
				tailNode = null;
				interval = interval - 1;

			} else {
				i++;

				currentNodePtr = currentNodePtr.nextNode;
			}

		}

		return linkedNodeOutput.nextNode;
	}

	/*
	 * Method to print the nodes.
	 */
	public static <T> void printNodes(Node<T> headNode) {
		Node<T> temp = headNode;
		while (temp != null) {

			System.out.print(temp.data + "\t");
			temp = temp.nextNode;
		}
		System.out.println();
	}

	/*
	 * Test Main Method.
	 */
	public static void main(String[] args) {
		

		System.out.println("Before unzip");
		Node<Integer> node1 = getFirstNode();
		printNodes(node1);
		System.out.println("Enter the interval");
		Scanner scanner = new Scanner(System.in);
		int interval = scanner.nextInt();
		Node<Integer> linkedNode = unzipLink(node1, interval);
		System.out.println("After unzip");
		printNodes(linkedNode);

	}

	/*
	 * Method to generate the linked list for testing.
	 */
	public static Node<Integer> getFirstNode() {
		Node<Integer> headNode2 = new Node<Integer>(100);
		Node<Integer> temp = headNode2;
		Integer a[] = new Integer[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		for (int i = 0; i < a.length; i++) {
			temp.nextNode = new Node<Integer>(a[i]);
			temp = temp.nextNode;
		}
		return headNode2.nextNode;
	}
}

class Node<T> {

	Node<T> nextNode;
	T data;

	public Node(Node<T> nextNode, T data) {

		this.nextNode = nextNode;
		this.data = data;
	}

	public Node(T data) {
		this.data = data;
		this.nextNode = null;

	}
}
