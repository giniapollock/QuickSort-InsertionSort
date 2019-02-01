// Virginia Pollock 
// CIS 2353
// Fall 2018
// Prof. John P. Baugh

import java.util.Random;

public class SortingAlgorithms {

public static void QuickSort(int[] items) {
   QuickSort(items, 0, items.length - 1);
}

public static void QuickSort(int[] items, int left, int right) {

   int part = Partition(items, left, right);
   if (left < part - 1) {
       QuickSort(items, left, part - 1);
   }

   if (part < right) {
       QuickSort(items, part, right);
   }
}//end QuickSort

private static int Partition(int[] items, int left, int right) {

   int p = left;
   int q = right;
   int temp;
   int pivot;
   
   pivot = items[(left + right) / 2];

   while (p <= q) {

       while (items[p] < pivot) {
           p++;
       }

       while (items[q] > pivot) {
           q--;
       }

       if (p <= q) {
           temp = items[p];
           items[p] = items[q];
           items[q] = temp;
           p++;
           q--;
       }
   }
   return p;
}//end Partition

public static void InsertionSort(int[] items) {
   for (int i = 1; i < items.length; i++) {
       int temp = items[i];
       int j = i;
       while (j > 0 && temp < items[j - 1]) {
           items[j] = items[j - 1];
           j--;
       }
       items[j] = temp;
   }
}// end InsertionSort
}// end SortingAlgorithm