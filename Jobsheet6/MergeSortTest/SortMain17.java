package MergeSortTest;

public class SortMain17 {
    
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting17 mSort = new MergeSorting17();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
