import java.util.LinkedList;

import java.util.Queue;

import java.util.Stack;

public class Queue_Stack {

    public static void main(String a[]) {

        Queue<Integer> q1 = new LinkedList<Integer>();

        // Add elements to the Queue
        q1.add(18);

        q1.add(37);

        q1.add(41);

        q1.add(85);

        q1.add(54);

        q1.add(21);

        System.out.println("Elements in Queue:" + '\n' + q1);

        int rem, rem1, r1, r2, r3, r4;

        rem = q1.remove();

        rem1 = q1.remove();

        r1 = q1.remove();

        r2 = q1.remove();

        r3 = q1.remove();

        r4 = q1.remove();

        Stack<Integer> removedelements = new Stack<>();

        Stack<Integer> stack1 = new Stack<>();

        // Storing removed elements of queue into a stack
        removedelements.push(rem);

        removedelements.push(rem1);

        // Storing remaining elements of queue into a stack
        stack1.push(r1);

        stack1.push(r2);

        stack1.push(r3);

        stack1.push(r4);

        // Printing removed elements and remaining elements of Queue using Stack
        System.out.println("Elements removed: \n" + removedelements);

        System.out.println("Remaining Elements: \n" + stack1);

    }
}
