package algorithm.sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		
		quickSort(a, 0, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }
	}

	private static void quickSort(int[] a, int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partion(a, start, end);
		quickSort(a, start, pivotIndex);
		quickSort(a, pivotIndex+1, end);
		
	}

	private static int partion(int[] a, int start, int end) {
		int pivot = a[start];
		int i = start;
		int j = end;
		
		while(i<j && a[--j] >= pivot);
		if(i<j) {
			a[i] = a[j];
		}
		
		while(i<j && a[++i] >= pivot);
		if(i<j) {
			a[j] = a[i];
		}
		
		a[j] = pivot;
		return j;
	}
	
	

}
