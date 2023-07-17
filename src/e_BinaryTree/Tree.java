package e_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    protected Node root;
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(int number) {
        Node newNode = new Node();
        newNode.setNumber(number);

        if (root == null) {
            root = newNode;
        } else {
            addNodeRecursively(root, newNode);
        }
    }

    public void addNodeRecursively(Node currentNode, Node newNode) {
        if (newNode.getNumber() < currentNode.getNumber()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                currentNode = currentNode.getLeft();
                addNodeRecursively(currentNode, newNode);
            }
        } else {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                currentNode = currentNode.getRight();
                addNodeRecursively(currentNode, newNode);
            }
        }
    }

    public Node searchNode(int number) {
        Node findThisNode = new Node();

        if (root == null) {
            System.out.println("Tree is empty....");
            return null;
        } else {
            findThisNode = searchNodeRecursively(root, number);
        }

        return findThisNode;
    }

    public Node searchNodeRecursively(Node currentNode, int number) {
        Node findThisNode = new Node();
        findThisNode= null;

        if (currentNode == null) {
            System.out.println("Tree is empty...");
            return null;
        } else if (currentNode.getNumber() == number) {
            return findThisNode = currentNode;
        } else if (number < currentNode.getNumber()) {
            return searchNodeRecursively(currentNode.getLeft(), number);
        } else {
            return searchNodeRecursively(currentNode.getRight(), number);
        }
    }

    public Node search(int number) {
        Node currentNode = root;

        while (currentNode != null) {
            int currentNodeNumber = currentNode.getNumber();

            if (number == currentNodeNumber) {
                return currentNode; // Found the node with the given number
            } else if (number < currentNodeNumber) {
                currentNode = currentNode.getLeft(); // Traverse to the left child
            } else {
                currentNode = currentNode.getRight(); // Traverse to the right child
            }
        }
        return null; // Node with the given number not found
    }

    public void addNodeLoop(int number) {
        Node newNode = new Node();
        newNode.setNumber(number);

        if(root== null) {
            root = newNode;
        }else {
            Node currentNode = root;
            Node parent = null;
            while( currentNode != null) {
                parent = currentNode;
                if(newNode.getNumber() < currentNode.getNumber()) {
                    currentNode = currentNode.getLeft();
                }else {
                    currentNode = currentNode.getRight();
                }
            }

            if(newNode.getNumber() < parent.getNumber()) {
                parent.setLeft(newNode);
            }else {
                parent.setRight(newNode);
            }
        }
    }


    public void printTree() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>(); //we make a queue of nodes we want to print
        queue.offer(root); // this take the root and put it on the start of the queue. we start here.

        while (!queue.isEmpty()) { //as long as queue is not empty, we move on
            Node current = queue.poll(); // retrieve and remove the head of the queue and save it to a temp Node.
            System.out.print(current.getNumber() + " "); // we print this temp Node. (root node in the first round).

            if (current.getLeft() != null) { // we test if the temp node has a left leaf
                queue.offer(current.getLeft()); // we then add this leaf to the queue
            }

            if (current.getRight() != null) { //we also test if the temp node has a right leaf
                queue.offer(current.getRight()); /// we then add this leaf to the queue
            }
        }
        System.out.println();
    }
    public void rotateRight() {
        if (root == null || root.getLeft() == null)
            return;

        Node newRoot = root.getLeft();
        root.setLeft(newRoot.getRight());
        newRoot.setRight(root);
        root = newRoot;
    }

    public void rotateLeft() {
        if (root == null || root.getRight()== null)
            return;

        Node newRoot = root.getRight();
        root.setRight(newRoot.getLeft());
        newRoot.setLeft(root);
        root = newRoot;
    }

}
