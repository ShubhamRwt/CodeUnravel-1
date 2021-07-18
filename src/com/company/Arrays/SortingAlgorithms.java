package com.company.Arrays;

import java.util.Arrays;

public class SortingAlgorithms {


    public static void main(String[] args) {

        //n^2
        int[] ar = {5,4,3,11,2,1};

        insertionSort(ar);

        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int[] ar){

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){
                    ArrayUtils.placeSwap(ar,j,j+1);
                }
            }
        }
    }

    public static void selectionSort(int[] ar){

        // n^2
        for (int i = 0; i <ar.length ; i++) {

            int max = ArrayUtils.maxIndex(ar,0, ar.length-i-1);
            ArrayUtils.placeSwap(ar,max, ar.length-i-1);

        }
    }

    //Insertion Sort
    public static void insertionSort(int[] ar){

        for (int i = 1 ; i <ar.length ; i++) {

            for (int j = i ; j > 0 ; j--) {

                if(ar[j] < ar[j-1]){
                    ArrayUtils.placeSwap(ar, j ,j-1);
                } else {
                    break;
                }
            }
        }
    }

}

// Which out of these algorithms take min no. of swaps?  Selection Sort
// Which out of these algorithms take min no. of comparisons? Insertion Sort

/* Swaps cases
 Bubble Sort  ---> n + n-1 + n-2 + n-3    ==     n(n-1) = n^2
 Selection Sort    ++++              n -> n(swaps)
 Insertion Sort    1 + 2 + 3 + 4 ..... n = n(n+1)/2 = n^2 - n  = n^2
 */
 //Worst case
// Bubble Sort  ---> n + n-1 + n-2 + n-3    ==     n(n-1) = n^2
// Selection Sort    n^2
// Insertion Sort    1 + 2 + 3 + 4 .....n = n(n+1)/2 = n^2 - n  = n^2
//
 //Best case
// Insertion Sort --> n
