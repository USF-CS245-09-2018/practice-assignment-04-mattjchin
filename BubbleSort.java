package Lesson4;

public class BubbleSort implements SortingAlgorithm {

    /**
     * sort() for the BubbleSort class
     *
     * @param a the array of integers that will be sorted through
     */
    @Override
    public void sort(int[] a) {

        int count = 0;
        int len = a.length;  // Length of the array
        for(int x=count; x<len-1; x++){  // 1st for loop
            for(int i=0; i<len-1-x; i++){  // 2nd for loop
                if(a[i] > a[i+1]){  // Check if element in array at index i is greater than the element at i+1
                    int temp_number = a[i];  // If so then temporary variable stores the a[i] variable
                    a[i]= a[i+1];  // Element at index i becomes the value of the element at index i+1
                    a[i+1] = temp_number;  // Update the temp_number value to be the i+1 index element of array
                }
            }
        }

    }

}
