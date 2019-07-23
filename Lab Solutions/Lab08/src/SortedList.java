import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public interface SortedList<E extends Comparable<? super E>> {

    boolean add(E obj);

    E remove(int index);

    E get(int index);

    int size();

    boolean contains(E obj);

    int indexOf(E obj);

    void forEach(Consumer<? super E> action);

    E[] toArray();

    default boolean isEmpty() {
        return size() == 0;
    }

    default List<E> toList() {
        return Arrays.asList(toArray());
    }

}
