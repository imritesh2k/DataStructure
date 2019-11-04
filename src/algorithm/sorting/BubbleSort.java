package algorithm.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {20,35,-15,7,55,1,-22};
		
		for(int i=a.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(" "+a[j]+" ");
		}

	}

}
