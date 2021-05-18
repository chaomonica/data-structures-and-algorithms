package data.structures.and.algorithms.mergesort;

public class MergeSort {
    private int[] unsorted;
    private int[] temp;

    public int[] sort(int[] unsorted) {
        this.unsorted = unsorted;
        this.temp = new int[unsorted.length];

        sort(0, unsorted.length-1 );

        return this.unsorted;
    }

    public void sort(int leftStart, int rightEnd){
        if (leftStart < rightEnd) {
            int middle = (leftStart + rightEnd) / 2;

            sort(leftStart, middle);
            sort(middle+1, rightEnd);
            merge(leftStart, rightEnd);
        }
    }

    public int[] merge(int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (this.unsorted[left] < this.unsorted[right]) {
                temp[index] = this.unsorted[left];
                left++;
            } else {
                temp[index] = this.unsorted[right];
                right++;
            }
            index++;
        }

        System.arraycopy(this.unsorted, left, temp, index, leftEnd-left+1);
        System.arraycopy(this.unsorted, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, this.unsorted, leftStart, size);
        return temp;
    }

    public void setUnsorted(int[] unsorted) {
        this.unsorted = unsorted;
    }

    public void setTemp(int[] temp) {
        this.temp = temp;
    }
}
