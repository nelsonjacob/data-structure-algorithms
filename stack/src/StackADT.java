public interface StackADT<E> {
    // Insert an object to the stack
    void push(E e);
    // Gets the top item of the stack without removing it
    E peek();
    // Removes the top item of the stack, if applicable
    boolean pop();
    // returns whether the stack is empty or not
    boolean isEmpty();
}