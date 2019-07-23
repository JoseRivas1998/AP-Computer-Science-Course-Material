import java.util.function.Consumer;

public class LinkedSortedList<E extends Comparable<? super E>> implements SortedList<E> {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public LinkedSortedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean add(E obj) {
        // TODO 2.2
        // Pseudocode:
        /*
         * IF THE LIST IS EMPTY:
         *      set the head and tail to a new node with the given obj
         * OTHERWISE:
         *      Create a new node with the given data
         *      IF THE HEAD's DATA IS GREATER THAN THE OBJECT
         *          Set the head's previous pointer to the new node
         *          Set the new node's next pointer to the head
         *          Set the head pointer to the new node
         *      OTHERWISE IF THE TAIL IS LESS THAN THE OBJECT
         *          Set the tail's next pointer to the new node
         *          Set the new node's previous pointer to the tail
         *          Set the tail pointer to the new node
         *      OTHERWISE
         *          Find the interstion point
         *          Set the next pointer of the insertion point's previous node to the next node
         *          Set the previous pointer of the new node to the insertion point's previous node
         *          Set the next pointer of the new node to the insertion point
         *          Set the previous pointer of the insertion node to the new node
         *  Increase the size
         */
        // THIS IS A STUB
        return true;
    }

    private DoubleNode findInsertionPoint(E obj) {
        // TODO 2.1
        // Find the first node who's data is greater than the given object
        // THIS IS A STUB
        return null;
    }

    @Override
    public E get(int index) {
        // TODO 2.5
        // Check the bounds, get the data at the node at the given index
        // THIS IS A STUB
        return null;
    }

    @Override
    public E remove(int index) {
        // TODO 2.6
        // Psuedocode
        /*
         * Check the bounds
         * Get the node at the given index
         * IF THE INDEX IS THE HEAD
         *      Set the head to the node's next pointer
         *      Set the previous of the head to null
         * OTHERWISE IF THE INDEX IS THE TAIL
         *      Set the tail to the node's previous pointer
         *      Set the tail's next pointer to null
         * OTHERWISE
         *      Set the next of the node's previous node to the node's next
         *      Set the previous of the node's next to the node's previous
         * Decrease the size
         * Return the data at the node that was removed
         */
        return null;
    }

    private DoubleNode getNthNode(int index) {
        // TODO 2.4
        // Go through the chain of nodes n times and return the node at that position
        return null;
    }

    private void checkBounds(int index) {
        // TODO 2.3
        // Throw IndexOutOfBoundsException if given node is out of bounds
    }

    @Override
    public int size() {
        // TODO 2.7
        // THIS IS A STUB
        return 0;
    }

    @Override
    public boolean contains(E obj) {
        // TODO 2.8
        // Check if the given obj is in the list, use the .equals() method. Only use one return statement
        // THIS IS A STUB
        return false;
    }

    @Override
    public int indexOf(E obj) {
        // TODO 2.9
        // Find the index of the given object use the .equals() method. Only use one return statement. Return -1 if not found
        // THIS IS A STUB
        return 0;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        // TODO 2.10
        // Iterate through the chain of nodes, call the accept method from action with each node's data
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray() {
        // TODO 2.11
        E[] arr = (E[]) new Comparable[size];// unchecked cast
        // Copy all the elements from the chain to the array
        // THIS IS A STUB
        return null;
    }

    @Override
    public String toString() {
        // TODO 2.12
        // Return a string that would be the same as if the toArray() had been passed into the Arrays.toString() method, but do not call toArray()
        return super.toString();
    }

    /**
     * A node for a doubly linked list
     */
    private class DoubleNode {
        DoubleNode previous;
        DoubleNode next;
        E data;

        public DoubleNode(E data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }

    }

}
