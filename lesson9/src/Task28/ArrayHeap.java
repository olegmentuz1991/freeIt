package Task28;

public class ArrayHeap<T> {
    private T[] array;

    ArrayHeap(T[] array) {
        this.array = array;
    }

    T getIndex(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
            return null;
        }
    }
}
