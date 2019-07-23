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
        checkCapacity();
        int insertion = getInsertionPoint(obj);
        shiftElementsLeft(insertion);
        data[insertion] = obj;
        size++;
        return true;
    }

    private void checkCapacity() {
        if(size >= data.length) {
            resize();
        }
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = data.length * 2;
        E[] temp = (E[]) new Comparable[newCapacity]; // Unchecked cast
        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private int getInsertionPoint(E obj) {
        int insertionPoint;
        if(size == 0) {
            insertionPoint = 0;
        } else {
            insertionPoint  = 0;
            while(insertionPoint < size && data[insertionPoint].compareTo(obj) < 0) {
                insertionPoint++;
            }
        }
        return insertionPoint;
    }

    private void shiftElementsLeft(int index) {
        for(int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
    }

    @Override
    public E remove(int index) {
        checkBounds(index);
        E val = data[index];
        shiftElementsRight(index);
        size--;
        return val;
    }

    private void shiftElementsRight(int index) {
        for(int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
    }

    @Override
    public E get(int index) {
        checkBounds(index);
        return data[index];
    }

    private void checkBounds(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E obj) {
        boolean found = false;
        for(int i  = 0; i < size && !found; i++) {
            if(data[i].equals(obj)) {
                found = true;
            }
        }
        return found;
    }

    @Override
    public int indexOf(E obj) {
        boolean found = false;
        int index = -1;
        for(int i = 0; i < size && !found; i++) {
            if(data[i].equals(obj)) {
                found = true;
                index = i;
            }
        }
        return index;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        for(int i = 0; i < size; i++) {
            action.accept(data[i]);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray() {
        E[] arr = (E[]) new Comparable[size]; // unchecked cast
        for(int i = 0; i < size; i++) {
            arr[i] = data[i];
        }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++) {
            sb.append(data[i]);
            if(i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
