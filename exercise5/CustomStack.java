package assignment.exercise5;

public class CustomStack {
    StackNode top;
    int min;
    
    public CustomStack() {
        this.top = null;
    }
    
    public int top() {
        return top.elem;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public void push(StackNode node) {
        if(node != null) {
           if(!nodeExists(node.elem)) {
               node.next = top;
               top = node;
               if(node.next == null) {
                   min = node.elem;
               }
               if(min > node.elem) {
                   min = node.elem;
               }
           }
        }
    }
    
    public boolean nodeExists(int elem) {
        boolean exists = false;
        
        StackNode aux = top;
        while(!exists && aux != null) {
            exists = aux.elem == elem;
            aux = aux.next;
        }
        
        return exists;
    }
    
    public int getMin() {
        return min;
    }

}
