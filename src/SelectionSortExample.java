import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortExample {

   public static int[] selectionSort(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j; // searching for lowest index
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
       int counter = 0;
       int c = 0;
       for (int i = 1; i < arr.length; i++) {
           while (arr[c] < arr[i]-1) {
               arr[c]++;
               counter++;
           }
           c++;
       }

       return arr;
   }

    public static void main(String[] args) {
        selectionSort(new int[] {6, 2, 3, 8});
    }
}
