package lesson5.noa.sharabi;

public class SortedArray <T extends Comparable<T>>{
    private T[] arr=(T[])new Comparable[10];
    private int size;

    public SortedArray(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    public SortedArray() {

    }
    public void addItem(T item){
        if (size== arr.length) {
            System.out.println("Can not add- array is full");
            return;
        }
        arr[size++]=item;
        for (int i = size-1; i>0; i--) {
            if(arr[i-1].compareTo(item)<=0)
                return;
            arr[i]=arr[i-1];
            arr[i-1]=item;
        }
    }
    public T getItem(int index){
        if (index<0||index>size)
            return null;
        return arr[index];
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i<size-1)
                sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
}