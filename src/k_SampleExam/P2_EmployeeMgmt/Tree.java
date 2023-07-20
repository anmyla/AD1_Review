package k_SampleExam.P2_EmployeeMgmt;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void buildExampleTree() {
        root = new Node(new Employee(53, "Thomas"));

        Node r = new Node(new Employee(78, "Francesca"));
        root.setRight(r);

        Node l = new Node(new Employee(45, "Laura"));
        root.setLeft(l);

        Node ll = new Node(new Employee(40, "Marc"));
        l.setLeft(ll);

        Node lr = new Node(new Employee(49, "Peter"));
        l.setRight(lr);

        Node rr = new Node(new Employee(90, "Stefan"));
        r.setRight(rr);

        Node lll = new Node(new Employee(11, "Klaus"));
        ll.setLeft(lll);

        Node rrl = new Node(new Employee(87, "Franz"));
        rr.setLeft(rrl);

        Node rl = new Node(new Employee(77, "Lisa"));
        r.setLeft(rl);
    }


    public Employee searchForNumber1(int number) {
        return searchForNumberRecursive(root, number);
    }


    public Employee searchForNumberRecursive(Node currentNode, int number) {
        if (currentNode == null) {
            return null;
        } else if (currentNode.getEmployee().getNumber() == number) {
            return currentNode.getEmployee();
        } else if (currentNode.getEmployee().getNumber() < number) {
            return searchForNumberRecursive(currentNode.getRight(), number);
        } else if (currentNode.getEmployee().getNumber() > number) {
            return searchForNumberRecursive(currentNode.getLeft(), number);
        }
        return null;
    }


    public Employee searchForNumberRecursive5(Node currentNode, int number) {
        if (currentNode == null) {
            System.out.println("No employee records found");
            return null;
        } else if (currentNode.getEmployee().getNumber() == number) {
            return currentNode.getEmployee();
        } else if (number < currentNode.getEmployee().getNumber()) {
            return searchForNumberRecursive(currentNode.getRight(), number);
        } else if (number > currentNode.getEmployee().getNumber()) {
            return searchForNumberRecursive(currentNode.getRight(), number);
        }
        return null;
    }


    public Employee searchForNumber(int number) { //whileLoop
        //we need a temp variable and save the root in it (that's where we start our seach)
        Node currentNode = root;

        while (currentNode != null) {
            //check if the currentNode is already the employee we are searching for
            if (currentNode.getEmployee().getNumber() == number) {
                // Employee with the given number found
                return currentNode.getEmployee();
            } else if (currentNode.getEmployee().getNumber() > number) {
                currentNode = currentNode.getLeft(); // Move to the left subtree
            } else {
                currentNode = currentNode.getRight(); // Move to the right subtree
            }
        }
        // Employee with the given number was not found in the tree
        return null;
    }

}
