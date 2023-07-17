package e_BinaryTree;

public class MainTree {
    public static void main(String[] args) {
        Tree thisTree = new Tree();
        thisTree.addNode(42);
        thisTree.addNode(25);
        thisTree.addNode(73);
        thisTree.addNode(46);
        thisTree.addNode(82);
        thisTree.addNode(35);
        thisTree.addNode(40);
        thisTree.addNode(64);
        thisTree.addNode(12);
        thisTree.addNodeLoop(94);
        thisTree.addNodeLoop(6);

        thisTree.printTree();

        System.out.println("Search Node with recursion: : " + thisTree.searchNode(12));
        System.out.println("Search Node with while loop: " + thisTree.search(64));
        System.out.println("When searching a number not in the tree: "+ thisTree.search(120)); //not in the tree


        System.out.println("\nAfter rotate RIGHT:");
        thisTree.rotateRight();
        thisTree.printTree();

        System.out.println("\nAfter rotate LEFT:");
        thisTree.rotateLeft();
        thisTree.printTree();

        System.out.println("\nPut the tree in a queue");
        QueueTree treeToQueue = new QueueTree();
        treeToQueue.makeTheTreeToAQueue(thisTree);
        treeToQueue.printQueue(treeToQueue);

        System.out.println();
        System.out.println("\nFind a Node. BreadthFirstSearch Method:");
        System.out.println(treeToQueue.breadthFirstSearch(thisTree, 40));
    }
}
