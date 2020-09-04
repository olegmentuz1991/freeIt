package Task28;

public class Task28 {
    public static void main(String[] args) {

    Integer[] arrayInt = {1,2,3,4,5,6,7,8,9,10};
    String[] arrayString = {"Vasya","Petya", "Kolya", "Dima"};
    ArrayHeap heap1 = new ArrayHeap(arrayInt);
    ArrayHeap heap2 = new ArrayHeap(arrayString);
        System.out.println(heap1.getIndex(3));
        System.out.println(heap2.getIndex(0));
        System.out.println(heap2.getIndex(100));
    }

}
