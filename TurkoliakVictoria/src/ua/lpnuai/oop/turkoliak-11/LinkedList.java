import java.io.Serializable;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T>, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4043746151092319264L;
    private LinkedListNode<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(T object) {
        this.head = new LinkedListNode<>(object, head);
        this.size = 1;
    }

    public void add(T object) {
        LinkedListNode<T> newObject = new LinkedListNode<T>(object, head);
        this.head = newObject;
        this.size++;
    }

    public void add(int position, T object) {
        if (position == 0) {
            add(object);
        } else if (position > this.size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            LinkedListNode<T> first = this.head;
            for (int i = 0; i < position - 1; i++) {
                this.head = head.getNext();
            }
            LinkedListNode<T> newObject = new LinkedListNode<T>(object, this.head.getNext());
            this.head.setNext(newObject);
            this.head = first;
            this.size++;
        }
    }

    public boolean remove(int position) {
        if (position == 0) {
            this.head = this.head.getNext();
        } else if (position > this.size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            LinkedListNode<T> first = this.head;
            for (int i = 0; i < position - 1; i++) {
                this.head = head.getNext();
            }
            this.head.setNext(head.getNext().getNext());
            this.head = first;
        }
        this.size--;
        return true;
    }

    public void remove(T object) {
        LinkedListNode<T> temp = head;
        int i = 0;
        while (!temp.getData().equals(object)) {
            if (temp.getNext() == null) {
                return;
            }
            temp = temp.getNext();
            i++;
        }
        remove(i);
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public Object[] toArray() {
        Object[] array = new Object[this.size];
        LinkedListNode<T> walker = this.head;
        for (int i = 0; i < this.size; i++) {
            array[i] = walker.getData();
            walker = walker.getNext();
        }
        return array;
    }

    public String toString() {
        StringBuilder buff = new StringBuilder();
        LinkedListNode<T> walker = this.head;
        for (int i = 0; i < this.size; i++) {
            buff.append(walker.getData().toString() + "\n");
            walker = walker.getNext();
        }
        return buff.toString();
    }

    public boolean contains(T object) {
        LinkedListNode<T> temp = head;
        while (!temp.getData().equals(object)) {
            if (temp.getNext() == null) {
                return false;
            }
            temp = temp.getNext();
        }
        return true;
    }

    public void printList() {
        LinkedListNode<T> walker = head;
        for (int i = 0; i < size; i++) {
            System.out.println(walker.getData());
            walker = walker.getNext();
        }
    }

    @Override
    public ListIterator<T> iterator() {
        return new ListIterator<T>(head);
    }

    @SuppressWarnings("hiding")
    class ListIterator<T> implements java.util.Iterator<T> {

        private int cursor;
        private final int end;
        private LinkedListNode<T> head;

        public ListIterator(LinkedListNode<T> head) {
            this.head = head;
            this.cursor = 0;
            this.end = size;
        }

        @Override
        public boolean hasNext() {
            return this.cursor < end;
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int current = cursor;
            cursor++;
            LinkedListNode<T> walker = head;
            for (int i = 0; i < current; i++) {
                walker = walker.getNext();
            }
            return walker.getData();
        }
    }
}

class LinkedListNode<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5984863540921876554L;
    private T data;
    private LinkedListNode<T> next;

    LinkedListNode(T data, LinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public LinkedListNode<T> getNext() {
        return this.next;
    }

}