// ** using size variable and head and tail
// import java.util.Scanner;

// public class DLL {

//     class Node {
//         int data;
//         Node prev;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     private Node head;
//     private Node tail;
//     private int size = 0; // keep track of list size

//     // Insert at beginning
//     void insertBeg(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             newNode.next = head;
//             head.prev = newNode;
//             head = newNode;
//         }
//         size++;
//         System.out.println("Inserted " + data + " at beginning.");
//     }

//     // Insert at end
//     void insertEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//         size++;
//         System.out.println("Inserted " + data + " at end.");
//     }

//     // Insert at specific index (0-based)
//     void insertAtIndex(int index, int data) {
//         if (index < 0 || index > size) {
//             System.out.println("Invalid index.");
//             return;
//         }
//         if (index == 0) {
//             insertBeg(data);
//             return;
//         }
//         if (index == size) {
//             insertEnd(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         Node temp = head;
//         for (int i = 0; i < index - 1; i++) {
//             temp = temp.next;
//         }

//         newNode.next = temp.next;
//         newNode.prev = temp;
//         temp.next.prev = newNode;
//         temp.next = newNode;

//         size++;
//         System.out.println("Inserted " + data + " at index " + index + ".");
//     }

//     // Delete from beginning
//     void delBeg() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         System.out.println("Deleting " + head.data + " from beginning.");
//         if (head.next == null) {
//             head = tail = null;
//         } else {
//             head = head.next;
//             head.prev = null;
//         }
//         size--;
//     }

//     // Delete from end
//     void delEnd() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         System.out.println("Deleting " + tail.data + " from end.");
//         if (head.next == null) {
//             head = tail = null;
//         } else {
//             tail = tail.prev;
//             tail.next = null;
//         }
//         size--;
//     }

//     // Delete from specific index
//     void deleteAtIndex(int index) {
//         if (index < 0 || index >= size) {
//             System.out.println("Invalid index.");
//             return;
//         }
//         if (index == 0) {
//             delBeg();
//             return;
//         }
//         if (index == size - 1) {
//             delEnd();
//             return;
//         }

//         Node temp = head;
//         for (int i = 0; i < index; i++) {
//             temp = temp.next;
//         }

//         System.out.println("Deleting " + temp.data + " from index " + index + ".");
//         temp.prev.next = temp.next;
//         temp.next.prev = temp.prev;
//         size--;
//     }

//     // Display list forward
//     void displayForward() {
//         Node temp = head;
//         if (temp == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         System.out.print("null ");
//         while (temp != null) {
//             System.out.print("<-" + temp.data + "-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Display list backward
//     void displayBackward() {
//         Node temp = tail;
//         if (temp == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         System.out.print("null ");
//         while (temp != null) {
//             System.out.print("<-" + temp.data + "-> ");
//             temp = temp.prev;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         DLL dll = new DLL();
//         int choice;

//         System.out.println("=== DOUBLY LINKED LIST MENU ===");
//         while (true) {
//             System.out.println("\n1. Insert at Beginning");
//             System.out.println("2. Insert at End");
//             System.out.println("3. Insert at Index");
//             System.out.println("4. Delete from Beginning");
//             System.out.println("5. Delete from End");
//             System.out.println("6. Delete from Index");
//             System.out.println("7. Display Forward");
//             System.out.println("8. Display Backward");
//             System.out.println("9. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter data: ");
//                     dll.insertBeg(sc.nextInt());
//                     break;
//                 case 2:
//                     System.out.print("Enter data: ");
//                     dll.insertEnd(sc.nextInt());
//                     break;
//                 case 3:
//                     System.out.print("Enter index: ");
//                     int idx = sc.nextInt();
//                     System.out.print("Enter data: ");
//                     int val = sc.nextInt();
//                     dll.insertAtIndex(idx, val);
//                     break;
//                 case 4:
//                     dll.delBeg();
//                     break;
//                 case 5:
//                     dll.delEnd();
//                     break;
//                 case 6:
//                     System.out.print("Enter index to delete: ");
//                     dll.deleteAtIndex(sc.nextInt());
//                     break;
//                 case 7:
//                     dll.displayForward();
//                     break;
//                 case 8:
//                     dll.displayBackward();
//                     break;
//                 case 9:
//                     System.out.println("Exiting program...");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice. Try again!");
//             }
//         }
//     }
// }


// WITHOUT using size

import java.util.Scanner;

public class DLL {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;

    // Helper: count number of nodes
    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Insert at beginning
    void insertBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted " + data + " at beginning.");
    }

    // Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted " + data + " at end.");
    }

    // Insert at specific index (0-based)
    void insertAtIndex(int index, int data) {
        int size = countNodes();

        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            insertBeg(data);
            return;
        }

        if (index == size) {
            insertEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Inserted " + data + " at index " + index + ".");
    }

    // Delete from beginning
    void delBeg() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Deleting " + head.data + " from beginning.");
        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete from end
    void delEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Deleting " + tail.data + " from end.");
        if (head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete from specific index
    void deleteAtIndex(int index) {
        int size = countNodes();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            delBeg();
            return;
        }

        if (index == size - 1) {
            delEnd();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        System.out.println("Deleting " + temp.data + " from index " + index + ".");
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // Display list forward
    void displayForward() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("null ");
        while (temp != null) {
            System.out.print("<-" + temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display list backward
    void displayBackward() {
        Node temp = tail;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("null ");
        while (temp != null) {
            System.out.print("<-" + temp.data + "-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL dll = new DLL();
        int choice;

        System.out.println("=== DOUBLY LINKED LIST MENU ===");
        while (true) {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Index");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Index");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Backward");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    dll.insertBeg(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    dll.insertEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter data: ");
                    int val = sc.nextInt();
                    dll.insertAtIndex(idx, val);
                    break;
                case 4:
                    dll.delBeg();
                    break;
                case 5:
                    dll.delEnd();
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    dll.deleteAtIndex(sc.nextInt());
                    break;
                case 7:
                    dll.displayForward();
                    break;
                case 8:
                    dll.displayBackward();
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
