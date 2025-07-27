class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    ListNode head;

    // Traverse the list
    void traversal() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at the beginning
    void insert_at_begin(int data) {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
    }

    // Insert at the end
    void insert_at_end(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // Insert at a specific position (currently hardcoded to position 3)
    void insert_at_position(int data) {
        ListNode newnode = new ListNode(data);
        ListNode temp = head;
        int cur_pos = 1;
        int position = 3; // You can change this to a parameter if needed

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }
        while (temp != null && cur_pos < position - 1) {
            temp = temp.next;
            cur_pos++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Delete the last node
    void del_at_end() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}

public class Linkedlist2 {
    public static void main(String[] args) {
        Linkedlist ob = new Linkedlist();

        ob.insert_at_begin(111);
        ob.insert_at_begin(222);
        ob.insert_at_begin(333);
        ob.insert_at_end(518);
        ob.traversal();  // Before deletion

        ob.del_at_end(); // Delete last node

        System.out.println("After deleting last node:");
        ob.traversal();  // After deletion
    }
}
