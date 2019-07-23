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
        if(size == 0) {
            head = new DoubleNode(obj);
            tail = head;
        } else {
            DoubleNode newNode = new DoubleNode(obj);
            if(head.data.compareTo(obj) > 0) {
                head.previous = newNode;
                newNode.next = head;
                head = newNode;
            } else if(tail.data.compareTo(obj) < 0) {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            } else {
                DoubleNode insertionPoint = findInsertionPoint(obj);
                insertionPoint.previous.next = newNode;
                newNode.previous = insertionPoint.previous;
                newNode.next = insertionPoint;
                insertionPoint.previous = newNode;
            }
        }
        size++;
        return true;
    }

    private DoubleNode findInsertionPoint(E obj) {
        DoubleNode insertionPoint = null;
        boolean found = false;
        for(DoubleNode node = head; node != null && !found; node = node.next) {
            if(node.data.compareTo(obj) > 0) {
                found = true;
                insertionPoint = node;
            }
        }
        return insertionPoint;
    }

    @Override
    public E remove(int index) {
        checkBounds(index);
        DoubleNode node = getNthNode(index);
        if(index == 0) {
            head = node.next;
            head.previous = null;
        } else if(index == size - 1) {
            tail = node.previous;
            tail.next = null;
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
        return node.data;
    }

    @Override
    public E get(int index) {
        checkBounds(index);
        DoubleNode node = getNthNode(index);
        return node.data;
    }

    private DoubleNode getNthNode(int index) {
        DoubleNode node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
        for(DoubleNode node = head; node != null && !found; node = node.next) {
            if(node.data.equals(obj)) {
                found = true;
            }
        }
        return found;
    }

    @Override
    public int indexOf(E obj) {
        int foundIndex = -1;
        boolean found = false;
        int i = 0;
        for(DoubleNode node = head; node != null && !found; node = node.next) {
            if(node.data.equals(obj)) {
                found = true;
                foundIndex = i;
            }
            i++;
        }
        return foundIndex;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        for(DoubleNode node = head; node != null; node = node.next) {
            action.accept(node.data);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray() {
        E[] arr = (E[]) new Comparable[size];// unchecked cast
        int index = 0;
        for(DoubleNode node = head; node != null; node = node.next) {
            arr[index] = node.data;
            index++;
        }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(DoubleNode node = head; node != null; node = node.next) {
            sb.append(node.data);
            if(node.next != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private class DoubleNode {
        DoubleNode previous;
        DoubleNode next;
        E data;

        public DoubleNode(E data) {
            this(data, null, null);
        }

        public DoubleNode(E data, DoubleNode previous, DoubleNode next) {
            this.previous = previous;
            this.next = next;
            this.data = data;
        }

    }

}
