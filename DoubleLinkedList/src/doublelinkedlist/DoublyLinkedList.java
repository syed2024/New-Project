/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author Syed Bukahri Exam Date: 12/12/2023
 */
public class DoublyLinkedList {

   
    private ListNode2Way start; //first node in the linked list. Can find all the others from this node
    private ListNode2Way current; //the currently selected node in the list (set to last for now)
    private ListNode2Way end; //the last node in the list
    
    private int count = 0;
    
    // constructors
    public DoublyLinkedList() {
    }

    public DoublyLinkedList(ListNode2Way items) {
        this.start = items;
    }
        
    /**
     * Sets the current item to the start of the list
     */
    public void start(){
        current = start;
    }
    
    /**
     * Sets the current item to the end of the list
     */
    public void end(){
        ListNode2Way temp = start;

        //navigate the list until pointer is the item before current
        while(temp.next != null)
        {
            temp = temp.next;
        }
        end = temp;
        current = end;
    }
    
    
    /**
     * Adds item before the current item. If there is no list it makes item the 
     * first ListNode in the list
     * @param inItem The new node to be added
     */
    public void addBefore(ListNode2Way inItem){
        //exit if list is empty
        if(start == null){
            start = inItem;
            current = start;
            end = start; // pointing the end to current as there is only one node
        }
        //if current is first item
        else if(current == start)
        {
            inItem.next = current;
            current.previous = inItem;
            start = inItem;
            
        }
        //if current is any other item
        else{
            //make a pointer
            ListNode2Way temp = start;

            //navigate the list until pointer is the item before current
            while(temp.next != current)
            {
                temp = temp.next;
            }
            
            //set the item before current to point to our new item
            temp.next = inItem;
            inItem.previous = temp; // connecting with previous node
            
            //set our new item to point to current
            inItem.next = current;
        }
        
        // increase the count to get linkedList size
        count ++;
    }
    
    /**
     * Adds item after current. If the list is empty, make the new item the
     * first item in the list
     * @param inItem the new item to add
     */
    public void addAfter(ListNode2Way inItem){
        //if the list is empty
        if(start == null){
           // make the new item the first item in the list
            start = inItem;
            current = start;
        }
        else{   
            //if the list has data
            //set new items next to be currents old next if it has one
            inItem.next = current.next;
            //set it to be the node after current
            
            if (current.next != null) {
                current.next.previous = inItem;
            }
            // set it to be the node after current
            current.next = inItem;
            inItem.previous = current;
        }
        
        // increase the count to get linkedList size
        count ++;
    }
    
    /**
     * return the size of the linkedList
     */
    public int size(){
        return count; // count is containg the linekList size
    }
    
    /**
     * Returns the data of the current node
     * @return the data of the current node in Object format
     */
    public Object getCurrent(){
        return current.getData();
    }
    
    /**
     * Deletes the current node from the linked list and makes the next node current
     */
    public void remove(){
        //if the list is empty, exit function
        if(start == null)
        {
            return;
        }
        //if current is the first item
        if(current == start)
        {
            start = current.next;
            if (start != null) {
                start.previous = null;
            }
        }
        else{
            //if current is not the first item
            //make a pointer
            ListNode2Way temp = start;

            //navigate the list until pointer is the item before current
            while(temp.next != current)
            {
                temp = temp.next;
            }

            //change next property to point to the item after next
            temp.next = current.next;
            current = current.next;
            current.previous = temp;
        }
        
    }
    
    // move one node forward from current
    public boolean advance(){
        //if current is last item in the list
        if(current.next == null)
        {
            return false;
        }
        else
        {
            //move current to the next item in the list
            current = current.next;
            return true;
        }
    }
    
    // move one node backword from current
    public boolean previous(){
        //if current is last item in the list
        if(current.previous == null)
        {
            return false;
        }
        else
        {
            //move current to the next item in the list
            current = current.previous;
            return true;
        }
    }
    
    //prints out all items in the linked list in forward
    public void printForward(){
        System.out.println("=============PRINT FUNCTION START=====================");
        //if the list is empty
        if(start == null)
        {
            System.out.println("The linked list is empty");
        }
        // if the list has data
        else
        {
            ListNode2Way temp2 = start;
            while(temp2 != null)
            {
                System.out.println(temp2.getData().toString());
                temp2 = temp2.next;
            }
        }
        System.out.println("=============PRINT FUNCTION END=====================");
    }
    
    //prints out all items in the linked list in forward
    public void printBackword(){
        System.out.println("=============PRINT BACKWORD FUNCTION START=====================");
        //if the list is empty
        if(start == null)
        {
            System.out.println("The linked list is empty");
        }
        // if the list has data
        else
        {
            end();
            
            ListNode2Way temp2 = current;
            while(temp2 != null)
            {
                System.out.println(temp2.getData().toString());
                temp2 = temp2.previous;
            }
        }
        System.out.println("=============PRINT BACKWORD FUNCTION END=====================");
    }
    
    /**
     * Allows user to add a new list node at the end of the list
     * 
     * @param inItem The list node to be added
     */
    public void add(ListNode2Way inItem) {
        // either the list is empty
        if (start == null) {
            // set the first item in the list
            start = inItem;
            current = start;
        }
        // or it's not
        else {
            ListNode2Way temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = inItem;
            inItem.previous = temp;
            current = temp.next;
        }
        
        // increase the count to get linkedList size
        count ++;
    }

}

