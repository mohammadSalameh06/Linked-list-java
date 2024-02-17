package LinkedList;


public class  LinkedList {


    private class node {
        
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
        
    }
    
    private node head;
    
    void insert (int value) {
        
        node newnode = new node (value);
        if(head == null) {
            
            head = newnode;
            
        }
        
        else {
            
            node i = head;
            while(i.next != null) {
                
                i = i.next;
                
            }
            
            i.next = newnode;
            
        }
        
    }
    
    void insert(int data, int p) {
        
    node newnode = new node (data);
    if(p == 0) {
        
        newnode.next = head;
        head = newnode;
        
    }
        
        else {
            
            node i = head;
            for(int j = 1; j < p; j++) {
                
                i = i.next;
                
            }
            
            newnode.next = i.next;
            i.next = newnode;
            
        }
        
    }
    
    void remove (int p) {
        
        if(p == 0) {
            node oldnode = head;
            head = head.next;
            oldnode.next = null;
            
        }
        
        else {
            
            node i = head;
            for(int j = 1; j < p; j++) {
                
                i = i.next;
                
            }
            
            node oldnode = i.next;
            i.next = oldnode.next;
            oldnode.next = null;
            
        }
        
    }
        
    
    void print() {
        
        System.out.print("[");
        node i = head;
        while(i != null) {
            
            System.out.print(i.data + ", ");
            i = i.next;
            
        }
        
        System.out.print("]");
                


}}
