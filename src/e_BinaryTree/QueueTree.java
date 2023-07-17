package e_BinaryTree;


import java.util.LinkedList;
import java.util.Objects;

public class QueueTree {
    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enqueue(Node node) {
        Node newNode = node;
        if (front == null) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public void makeTheTreeToAQueue(Tree tree) {
        LinkedList<Node> queue = new LinkedList<>();

        if (tree.root == null) {
            System.out.println("Nothing to queue here. Tree is empty");
        } else {
            Node currentNode = tree.root;
            enqueue(currentNode); // we add this Node to queue
            queue.add(currentNode);
            while (!queue.isEmpty()) { //as long as queue(list) is not empty, we move on
                if (currentNode.getLeft() != null) { // we test if the temp node has a left leaf
                    enqueue(currentNode.getLeft());// we then add this leaf to the queue
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) { //we also test if the temp node has a right leaf
                    enqueue(currentNode.getRight()); /// we then add this leaf to the queue
                    queue.add(currentNode.getRight());
                }
                if(queue.size() > 1) {
                    currentNode = queue.get(1);
                }
                queue.remove(0);
            }
        }
    }


    public Node  breadthFirstSearch(Tree tree, int number) {
        LinkedList<Node> queue = new LinkedList<>();
        Node nodeToFind = null;

        if (tree.root == null) {
            System.out.println("Nothing to search here. Tree is empty");
        } else {
            Node currentNode = tree.root;
            queue.add(currentNode);
            while (!queue.isEmpty()) { //as long as queue(list) is not empty, we move on
                if (currentNode.getNumber() == number){
                    nodeToFind = currentNode; //if we find it, we get out of the loop
                    break;
                }
                if (currentNode.getLeft() != null) { // we test if the temp node has a left leaf
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) { //we also test if the temp node has a right leaf
                    queue.add(currentNode.getRight());
                }
                if(queue.size() > 1) {
                    currentNode = queue.get(1);
                }
                queue.remove(0);
            }
        }
        return nodeToFind; //it will return Node if found, null if node is not found
    }

    public Node dequeue() {
        Node removeNode;
        if (front == null) {
            System.out.println("Queue is empty. Nothing to dequeue!");
            return null;
        } else if (front == rear) {
            removeNode = front;
            front = null;
            rear = null;
        } else {
            Node temp = front.getNext();
            removeNode = front;
            front = null;
            setFront(temp);
        }
        return removeNode;
    }

    public void printQueue(QueueTree tree) {
        Node currentNode = front;
        if (front == null) {
            System.out.println("Empty List. Nothing to print here...");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getNumber() + " ");
                currentNode = currentNode.getNext();
            }
        }
    }
}
