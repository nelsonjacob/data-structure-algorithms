import java.util.ArrayList;

public class CustomStack<E> implements StackADT<E> {

    private ArrayList<E> stackList;

    public CustomStack() {
        stackList = new ArrayList<E>();
    }

    @Override
    public void push(E e) {
        stackList.add(e);
    }

    @Override
    public E peek() {
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public boolean pop() {
        if (this.isEmpty()) {
            return false;
        }
        stackList.remove(stackList.get(stackList.size() - 1));
        return true;
    }

    @Override
    public boolean isEmpty() {
       return stackList.isEmpty();
    }
}