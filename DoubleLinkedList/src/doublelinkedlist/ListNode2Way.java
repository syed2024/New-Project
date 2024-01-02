/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author Syed Bukahri
 * Exam Date: 12/12/2023
 */
public class ListNode2Way {
    
    private Object data;
    public ListNode2Way next;       // our next node in lsit
    public ListNode2Way previous;   // our previous node in list
    
    public ListNode2Way()
    {
        
    }
    
    public ListNode2Way(Object data)
    {
         this.data = data;
    }
    
    public Object getData()
    {
        return this.data;
    }
    
    public void setData(Object data)
    {
        this.data = data;
    }
}
