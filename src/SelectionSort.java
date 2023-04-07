public class SelectionSort<T extends Comparable<T>> implements ISortAlgo<T>{
    @Override
    public void sort(T[] arrayToSort) {

        final int n = arrayToSort.length;
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j < n; j++){
                if(arrayToSort[i].compareTo(arrayToSort[j])>0) {
                    final T low=arrayToSort[j];
                    arrayToSort[j]=arrayToSort[i];
                    arrayToSort[i]=low;

                }
            }


        }

    }
}
