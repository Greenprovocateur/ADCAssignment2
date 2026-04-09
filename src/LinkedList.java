public class LinkedList {
    Node head;

    void add(Bank_Account account) {
        Node newNode = new Node(account);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            Bank_Account acc = (Bank_Account) temp.data;
            System.out.println(i + ". " + acc.username + " – Balance: " + acc.balance);
            temp = temp.next;
            i++;
        }
    }

    Bank_Account search(String username) {
        Node temp = head;
        while (temp != null) {
            Bank_Account acc = (Bank_Account) temp.data;
            if (acc.username.equals(username)) {
                return acc;
            }
            temp = temp.next;
        }
        return null;
    }
}