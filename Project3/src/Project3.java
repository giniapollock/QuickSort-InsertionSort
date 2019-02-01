// Virginia Pollock 
// CIS 2353
// Fall 2018
// Prof. John P. Baugh

import java.util.Random;

public class Project3 {
    
   public static void main(String[] args) {
       
    int size = 10;
    int[] arr1 = new int[size];
    int[] arr2 = new int[size];
    long timeStart, timeStop, timeElapsed, total, total1;
 
    fillArrays(arr1, arr2, size);
    total = 0;

    System.out.println("Quick Sort Size 10:");
    for (int i = 1; i <= 5; i++) {
        
        timeStart = System.nanoTime();
        SortingAlgorithms.QuickSort(arr1);
        timeStop = System.nanoTime();
        timeElapsed = timeStop - timeStart;
        total += timeElapsed;
        System.out.println(total);
       }

    total1 = 0;
    
    System.out.println("Insertion Sort Size 10:");
    for (int i = 1; i <= 5; i++) {

        timeStart = System.nanoTime();
        SortingAlgorithms.InsertionSort(arr2);
        timeStop = System.nanoTime();
        timeElapsed = timeStop - timeStart;
        total1 += timeElapsed;
        System.out.println(total1);
       }

    size = 25;
    arr1 = new int[size];
    arr2 = new int[size];
    fillArrays(arr1, arr2, size);
    total = 0;
        
    System.out.println("QuickSort Size 25:");
    for (int i = 1; i <= 5; i++) {
           
           timeStart = System.nanoTime();
           SortingAlgorithms.QuickSort(arr1);
           timeStop = System.nanoTime();
           timeElapsed = timeStop - timeStart;
           total += timeElapsed;
           System.out.println(total);
           }

           total1 = 0;

    System.out.println("Insertion Sort Size 25:");
    for (int i = 1; i <= 5; i++) {
        timeStart = System.nanoTime();
        SortingAlgorithms.InsertionSort(arr2);
        timeStop = System.nanoTime();
        timeElapsed = timeStop - timeStart;
        total1 += timeElapsed;
        System.out.println(total1);
       }
    
    size = 50;
    arr1 = new int[size];
    arr2 = new int[size];
    fillArrays(arr1, arr2, size);
    total = 0;
    
    System.out.println("QuickSort Size 50:");
    for (int i = 1; i <= 5; i++) {
           
           timeStart = System.nanoTime();
           SortingAlgorithms.QuickSort(arr1);
           timeStop = System.nanoTime();
           timeElapsed = timeStop - timeStart;
           total += timeElapsed;
           System.out.println(total);
    }

    total1 = 0;

    System.out.println("Insertion Sort Size 50:");
    for (int i = 1; i <= 5; i++) {
        timeStart = System.nanoTime();
        SortingAlgorithms.InsertionSort(arr2);
        timeStop = System.nanoTime();
        timeElapsed = timeStop - timeStart;
        total1 += timeElapsed;
        System.out.println(total1);
       }
    
    
    size = 100;
    arr1 = new int[size];
    arr2 = new int[size];
    fillArrays(arr1, arr2, size);
    total = 0;
    
    System.out.println("QuickSort Size 100:");
    for (int i = 1; i <= 5; i++) {
           
           timeStart = System.nanoTime();
           SortingAlgorithms.QuickSort(arr1);
           timeStop = System.nanoTime();
           timeElapsed = timeStop - timeStart;
           total += timeElapsed;
           System.out.println(total);
           }

           total1 = 0;

    System.out.println("Insertion Sort Size 100:");
    for (int i = 1; i <= 5; i++) {
        timeStart = System.nanoTime();
        SortingAlgorithms.InsertionSort(arr2);
        timeStop = System.nanoTime();
        timeElapsed = timeStop - timeStart;
        total1 += timeElapsed;
        System.out.println(total1);
       }
    
}
   
public static void fillArrays(int[] arr1, int[] arr2, int size) {
   Random rand = new Random();

   for (int i = 0; i < size; i++) {
       int number = rand.nextInt(size);
       arr1[i] = number;
       arr2[i] = number;
   }
}
} //end Project3
