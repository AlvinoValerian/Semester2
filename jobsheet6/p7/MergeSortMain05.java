package p7;

public class MergeSortMain05 {
    public static void main(String[] args) {
        int data[]={10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting05 mSort = new MergeSorting05();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
