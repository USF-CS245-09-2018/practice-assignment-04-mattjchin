package Lesson4;

public class SelectionSort implements SortingAlgorithm {

    /**
     * sort() for the SelectionSort class
     *
     * @param a the array of integers that will be sorted through
     */
    @Override
    public void sort(int[] a){

        for(int k = 0; k<a.length-1; k++){  // 1st for loop
            int index_count = k;  // Index count variable is the value of k in the for loop
            for(int i=k+1; i<a.length; i++)  // 2nd for loop
                if (a[i] < a[index_count])
                    index_count = i;  // Make index variable the value of i of 2nd for loop

            /*
                Update index_count element of array to be that of k
                Update k to be the new value of the min_number, the temporary variable
             */
            int min_number = a[index_count];
            a[index_count] = a[k];
            a[k] = min_number;
        }

    }

}
