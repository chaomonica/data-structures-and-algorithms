package data.structures.and.algorithms.quicksort;

public class QuickSort {

    int[] quickSortArr;

    public int[] sort(int[] unsorted) {
        this.quickSortArr = unsorted;
        sort(0, unsorted.length-1);
        return this.quickSortArr;
    }

    public void sort (int left, int right) {
        if (left < right) {


            int pi =  partition(left, right);
            sort(left, pi-1);
            sort(pi+1, right);
        }
    }

    public int partition(int left, int right){
        int pivot = this.quickSortArr[right];
        int i = left -1;


        for(int j = left; j <= right - 1; j++)
        {


            if (this.quickSortArr[j] < pivot)
            {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, right);
        return (i + 1);
    }


    public void swap(int i, int j) {
        int temp = this.quickSortArr[i];
        this.quickSortArr[i] = this.quickSortArr[j];
        this.quickSortArr[j] = temp;
    }


}
