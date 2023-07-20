package k_SampleExam.P1_DoctorWaitingList;

public class DoctorWaitingList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }


    public void addPatientAtLastPos(String name, String socialSecurityNo) {
        Node newNode = new Node(name, socialSecurityNo);

        if(first == null) {
            first = newNode;
            last = newNode;
        } else if(first == last) {
            last.setNext(newNode);
            last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }

    }

    public void addPatientAtLastPos1(String name, String socialSecurityNo) {
        // Create a new patient with the given name and social security number
        // Create a new node with the new patient
        Node newNode = new Node(name, socialSecurityNo);

        if (first == null) {
            // If the list is empty, set the new node as both first and last
            first = newNode;
            last = newNode;
        } else {
            // If the list is not empty, update the references accordingly
            last.setNext(newNode); // Set the next reference of the current last node to the new node
            newNode.setPrev(last); // Set the previous reference of the new node to the current last node
            last = newNode; // Update the last reference to the new node
        }
    }
}
