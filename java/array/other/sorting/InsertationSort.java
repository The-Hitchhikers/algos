

/**
 * @author yuriitsap.
 *
 *         http://practice.geeksforgeeks.org/problems/insertion-sort/1
 */

public class InsertationSort {

    void insert(int arr[], int i) {
	if (arr[i - 1] > arr[i]) {
	    int elementToSwap = arr[i];
	    int switchIndex = 0;
	    for (int k = i; k > 0; k--) {
		if (arr[k - 1] < elementToSwap) {
		    switchIndex = k;
		    break;
		}
		arr[k] = arr[k - 1];
	    }
	    arr[switchIndex] = elementToSwap;
	}
    }

    public static void main(String[] args) {
	InsertationSort.insertionSort(new int[]{4, 2, 3, 1, 9, 7}, 6);
    }

    public static void insertionSort(int arr[], int n) {
	InsertationSort obj = new InsertationSort();
	for (int i = 1; i < n; i++) {
	    obj.insert(arr, i);
	}
	System.out.println("finished ");
    }
}
