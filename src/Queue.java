public class Queue {
    Node front;
    Node rear;

    void addBill(String bill) {
        Node newNode = new Node(bill);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    String processBill() {
        if (front == null) return null;
        String bill = (String) front.data;
        front = front.next;
        if (front == null) rear = null;
        return bill;
    }

    void addRequest(AccountRequest request) {
        Node newNode = new Node(request);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    AccountRequest processRequest() {
        if (front == null) return null;
        AccountRequest request = (AccountRequest) front.data;
        front = front.next;
        if (front == null) rear = null;
        return request;
    }

    void showRequests() {
        Node temp = front;
        int i = 1;
        while (temp != null) {
            AccountRequest req = (AccountRequest) temp.data;
            System.out.println(i + ". " + req.username + " - " + req.initialDeposit);
            temp = temp.next;
            i++;
        }
    }

    void showBills() {
        Node temp = front;
        while (temp != null) {
            System.out.println("  - " + temp.data);
            temp = temp.next;
        }
    }

    boolean isEmpty() {
        return front == null;
    }
}