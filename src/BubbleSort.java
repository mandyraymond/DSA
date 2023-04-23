public class BubbleSort<T extends Comparable<T>> implements ISortAlgo<T>{
    @Override
    public void sort(T[] arrayToSort) {

        final int n = arrayToSort.length;
        for(int i = 0; i <= n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arrayToSort[j].compareTo(arrayToSort[j+1]) > 0) {
                    final T temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }
    }
}
