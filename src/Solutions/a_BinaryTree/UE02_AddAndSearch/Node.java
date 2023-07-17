package Solutions.a_BinaryTree.UE02_AddAndSearch;

public class Node {
    protected Node right;
    protected  Node left;
    protected int number;

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public int getNumber() {
        return number;
    }
}
