package algorithm.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {20,35,-15,7,55,1,-22};
		
		for(int i=a.length-1;i>0;i--) {
			int p = 0;
			for(int j=0;j<=i;j++) {
				if(a[j]>a[p]) {
					p = j;
				}
			}
			int temp = a[i];
			a[i] = a[p];
			a[p] = temp;
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(" "+a[j]+" ");
		}

	}

}
