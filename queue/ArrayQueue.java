import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/*
Reference doc: https://pages.cs.wisc.edu/~skrentny/cs367-common/readings/Stacks-and-Queues/

A queue class to be used in all Queue operations for leetcode practice
Not all Collection methods are implemented
 */
public abstract class QueueADT<E> implements QueueInterface<E> {

    private static final int INIT_SIZE = 10;
    private E[] items;
    private int numItems;

    public QueueADT() {
        this.items = new E[INIT_SIZE];




    }


    /**
     * @param e element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(E e) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public E element() {
        return null;
    }

    /**
     * @param e
     * @return
     */
    @Override
    public boolean offer(E e) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public E poll() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public E peek() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public E remove() {
        return null;
    }
}
