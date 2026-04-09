public class Stack {
    Node top;

    void push(String transaction) {
        Node newNode = new Node(transaction);
        newNode.next = top;
        top = newNode;
    }

    String pop() {
        if (top == null) return null;
        String transaction = (String) top.data;
        top = top.next;
        return transaction;
    }

    String peek() {
        if (top == null) return null;
        return (String) top.data;
    }
}
