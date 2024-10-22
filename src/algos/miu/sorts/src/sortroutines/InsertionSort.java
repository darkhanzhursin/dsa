package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class InsertionSort extends Sorter {
	public int[] sort(int[] anArray) {
		  if(anArray == null || anArray.length <= 1) {
			return anArray;
		  }
		  int len = anArray.length;
		  int temp = 0;
		  int j = 0;
		  for(int i = 1; i < len; ++i) {
		    temp = anArray[i];
		    j=i;
		    while(j>0 && temp < anArray[j-1]){
		       anArray[j] = anArray[j-1];
		       j--;
		    }
		    anArray[j]=temp;
		  }
		  return anArray;
	}

	// Sort from index l to r in the given array
	public void sort(int[] arr, int l, int r) {
		for (int i = l + 1; i <= r; i++) {
			int tmp = arr[i];
			int j = i;
			while (j > l && arr[j - 1] > tmp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = tmp;
		}
	}

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		sort.sort(new int[]{3, 1, 2});
	}
}
