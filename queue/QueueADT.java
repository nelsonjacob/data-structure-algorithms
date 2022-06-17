import java.util.*;

public interface QueueInterface<E> extends Collection<E> {

    boolean add(E e);

    E element();

    boolean offer(E e);

    E poll();

    E peek();

    E remove();

}

