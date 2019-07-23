import java.util.function.Consumer;

public class ArraySortedList<E extends Comparable<? super E>> implements SortedList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int size;

    public ArraySortedList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArraySortedList(int capacity) {
        data = (E[]) new Comparable[capacity]; // unchecked cast
        this.size = 0;
    }

    @Override
    public boolean add(E obj) {
        // TODO 1.5
        // Check the capacity, get the insertion point, shift elements, set the element in the array at the correct index to the given obj and increase size
        return true;
    }

    private void checkCapacity() {
        // TODO 1.2
        // If an element cannot be inserted at data[size], resize

    }

    @SuppressWarnings("unchecked")
    private void resize() {
        // TODO 1.1
        int newCapacity = data.length * 2;
        E[] temp = (E[]) new Comparable[newCapacity]; // Unchecked cast
        // Copy data into temp, and reassign the reference to be temp
    }

    private int getInsertionPoint(E obj) {
        // TODO 1.3
        // Return 0 if the list is empty, otherwise, return the first index in which the element is greater than the given object
        // THIS IS A STUB
        return 0;
    }

    private void shiftElementsLeft(int index) {
        // TODO 1.4
        // Hint, loop through the list backwards so that the element at the given index can be overwritten
    }

    @Override
    public E get(int index) {
        // TODO 1.7
        // Check the bounds, return the element at the given index
        // THIS IS A STUB
        return null;
    }

    @Override
    public E remove(int index) {
        // TODO 1.9
        // Check the bounds, get the element at the given index, shift elements right, decrease size
        // THIS IS A STUB
        return null;
    }

    private void shiftElementsRight(int index) {
        // TODO 1.8
        // HINT: Very similar to shiftElementsLeft
    }

    private void checkBounds(int index) {
        // TODO 1.6
        // If the index is invalid, throw IndexOutOfBoundsException
    }

    @Override
    public int size() {
        // TODO 1.10
        // THIS IS A STUB
        return 0;
    }

    @Override
    public boolean contains(E obj) {
        // TODO 1.11
        // Check if the given obj is in the list, use the .equals() method. Only use one return statement
        // THIS IS A STUB
        return false;
    }

    @Override
    public int indexOf(E obj) {
        // TODO 1.12
        // Find the index of the given object use the .equals() method. Only use one return statement. Return -1 if not found
        // THIS IS A STUB
        return 0;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        // TODO 1.13
        // Loop through each element in the list, and call the accept method in action. See Consumer in Java 8 Docs
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray() {
        // TODO 1.14
        E[] arr = (E[]) new Comparable[size]; // unchecked cast
        // Copy all the elements from the data to the array
        // THIS IS A STUB
        return null;
    }

    @Override
    public String toString() {
        // TODO 1.15
        // Return a string that would be the same as if the toArray() had been passed into the Arrays.toString() method, but do not call toArray()
        return super.toString();
    }
}
