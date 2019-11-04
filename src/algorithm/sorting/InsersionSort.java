package algorithm.sorting;

public class InsersionSort {

	public static void main(String[] args) {
		
		int[] a = {20,35,-15,7,55,1,-22};
		
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j;
			for(j=i;j>0 && a[j-1]>temp;j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(" "+a[j]+" ");
		}

	}

}
