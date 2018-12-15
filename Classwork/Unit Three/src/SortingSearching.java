
public class SortingSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 14, 16, 29, 30 };
		int[] b = { -1, 4, 7, 19, 23, 35, 84 };
		display(a);
		display(b);
		int[] c = merge(a, b);
		display(c);

		int[] d = { 15, 10, 2, 8, 28, 21 };
		int[] e = { 24, 5, 3, 12, 13, 17 };

		System.out.println("\nSelection Sort");
		display(d);
		System.out.println("Sorted:");
		selectionSort(d);
		display(d);

		System.out.println("\nInsertion Sort");
		display(e);
		System.out.println("Sorted:");
		selectionSort(e);
		display(e);

	}

	public static void insertionSort(int[] arr) {
		// assume index i down is sorted
		// get value of index i + 1
		// shift values down while index i + 1

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i - 1; arr[i] > arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = arr[i];
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ret = new int[arr1.length + arr2.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < ret.length; i++) {
			boolean over = j == arr1.length || k == arr2.length;
			if (j < arr1.length && (over || arr1[j] <= arr2[k])) { // arr1 smaller than arr2
				ret[i] = arr1[j];
				j++;
			} else if (k < arr2.length && (over || arr1[j] > arr2[k])) {
				ret[i] = arr2[k];
				k++;
			}
		}
		return ret;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.printf("%2d ", a);
		}
		System.out.println();
	}

}
