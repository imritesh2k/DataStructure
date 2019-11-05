package algorithm.sorting;

public class MergeSorting {

	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		
		mergeSort(a, 0, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }

	}
	
	
	public static void mergeSort(int[] a, int start, int end) {
		if(end-start<2) {
			return;
		}
			
		int mid = (end+start)/2;
		mergeSort(a, start, mid);
		mergeSort(a, mid, end);
		merge(a,start,mid,end);
	}


	private static void merge(int[] a, int start, int mid, int end) {
		if(a[mid-1] < a[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] tempArray = new int[end - start];
		
		while(i<mid && j<end) {
			tempArray[tempIndex++] = a[i] < a[j] ? a[i++] : a[j++];
		}
		
		/*
		 * src the source array. 
		 * srcPos starting position in the source array. 
		 * dest the destination array. 
		 * destPos starting position in the destination data. length
		 * the number of array elements to be copied.
		 * 
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 */
		System.arraycopy(a, i, a, start+tempIndex, mid - i);
		System.arraycopy(tempArray, 0, a, start, tempIndex);
		
		
	}

}
