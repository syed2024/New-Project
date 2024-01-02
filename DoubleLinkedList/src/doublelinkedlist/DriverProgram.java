/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlist;
import java.util.Scanner;

                              // Part 2 Answer:
 //                               Advantages of Link List Over Array:
    //                                1. ITs Dynamic Size
/**                                   2. Memory Efficiaent , its easy Implementation of Abstract Data type
 *                                    3.  More Efecient Sorting
 *                                Disadvantages are:
 *                                   1. Randomly accces by any one 
 *                                   2. Complex initilization as comapred to array
 *                                   3.  Extra Memory Usage
 *                                Advantages of Array over LinkList:
 *                                    1. We can access any array element
 *                                    2. We can traverse an array from back to front
 *                                    3.Deleting an array frees a contiguous memory area
 *                                 Disadvantages:
 *                                    1. The size of an array is fixed. Once the size is declared, it cannot be changed
 * @author Syed Bukahri               2.  Arrays are not very flexible
 * Exam Date: 12/12/2023              3. All the entries of an array must be of the same type
 *                              When to choose one on other:
 *                                     If we require multidimensional structure to store the data then we 
 *                                     choose array over list. List is one dimensional only . 
 *                                     So depend on program if one dimension but different data type so list will be
 *                                     better option
 */
public class DriverProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        ListNode2Way node1 = new ListNode2Way("Node1 data");        // inilizing nodes 
        ListNode2Way node2 = new ListNode2Way("Node2 data");
        ListNode2Way node3 = new ListNode2Way("Node3 data");
        ListNode2Way node4 = new ListNode2Way("Node4 data");
        ListNode2Way newNode = new ListNode2Way("New node data");
        
        DoublyLinkedList ll = new DoublyLinkedList();      // inilize Doubly link lsit here
        ll.addAfter(node1);
        ll.addAfter(node2);           // adding nodes to our list
        ll.addAfter(node3);
        ll.addAfter(node4);
        menu();
        // ask user choice
        int choice = userInput.nextInt();  // store the chocie and go inside while loop
        while (choice != 12) {
            switch (choice) {
            case 1 -> {
                    System.out.print("Insert data for add before: ");
                    userInput.nextLine();
                    var nodeData = userInput.nextLine(); // getiing node data from user
                    ListNode2Way nodeToAdd = new ListNode2Way(nodeData); //creating ListNode2Way with inserted data
                    ll.addBefore(nodeToAdd); // adding new node with addBefore
                    ll.printForward(); //printing to check if it's added correctly or not
                    menu();
                    choice = userInput.nextInt();
                }
                case 2 -> {
                    System.out.println("Insert data for add after: ");
                    userInput.nextLine();
                    var nodeData = userInput.nextLine(); // getiing node data from user
                    ListNode2Way nodeToAdd = new ListNode2Way(nodeData); //creating ListNode with inserted data
                    ll.addAfter(nodeToAdd); // adding new node with addBefore
                    ll.printForward(); //printing to check if it's added correctly or not
                    menu();
                    choice = userInput.nextInt();
                }
                case 3 -> {
                    ll.printForward();
                    menu();
                    choice = userInput.nextInt();
                }
                case 4 -> {
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    menu();
                    choice = userInput.nextInt();
                }
                case 5 -> {
                    ll.remove();
                    ll.printForward();//printing to check if it's deleted correctly or not
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    menu();
                    choice = userInput.nextInt();
                }
                case 6 -> {
                    ll.advance();
                    System.out.println("=======================================");
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    System.out.println("=======================================");
                    menu();
                    choice = userInput.nextInt();
                }
                case 7 -> {
                    ll.previous();
                    System.out.println("=======================================");
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    System.out.println("=======================================");
                    menu();
                    choice = userInput.nextInt();
                }
                case 8 -> {
                    System.out.println("The size of the list is :" + ll.size());
                    System.out.println("=======================================");
                    menu();
                    choice = userInput.nextInt();
                }
                case 9 -> {
                    ll.start();
                    System.out.println("=======================================");
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    System.out.println("=======================================");
                    menu();
                    choice = userInput.nextInt();
                }
                case 10 -> {
                    ll.end();
                    System.out.println("=======================================");
                    System.out.println("The data of current is " + ll.getCurrent().toString());
                    System.out.println("=======================================");
                    menu();
                    choice = userInput.nextInt();
                }
                case 11 -> {
                    ll.printBackword();
                    menu();
                    choice = userInput.nextInt();
                }
                case 12 -> System.out.println("Thanks for Testing!!!");
            }
            
        }
    }

    public static void menu() {
        System.out.println(
                 "1. Add Before\n"
                + "2. Add After\n"
                + "3. Print Forward \n"
                + "4. Get Current\n"
                + "5. Delete Current\n"
                + "6. Advance\n"
                + "7. Previous\n"
                + "8. Size\n"
                + "9. Start \n"
                + "10.End\n"
                + "11.Print Bacword\n"
                + "12. Exit\n");
        System.out.print("Your Choice: ");
    }

}
