package assignment.exercise5;

public class AssignmentExercise5 {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack();
        StackNode node1 = new StackNode(2, null);
        StackNode node2 = new StackNode(5, null);
        StackNode node3 = new StackNode(3, null);
        cs.push(node1);
        cs.push(node2);
        cs.push(node3);
        
        System.out.println(cs.top.elem);
        System.out.println(cs.getMin());

    }
    
}
